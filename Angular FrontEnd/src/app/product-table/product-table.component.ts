import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service'
import { product } from '../product'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  private Products:Array<any>;
  private page = 1;
  private pageSize = 4;
  private collectionSize = 20;

  
  constructor(
    private productService: ProductService
  ) { }

  ngOnInit() { 
    this.getProducts()
  }

  getProducts() {
    this.productService.getProducts().subscribe(
      res => { 
        this.Products = res,
        this.collectionSize = this.Products.length
        this.Products = this.products
      },
      (error) => { console.log(error.error.message) }
    )
  }

  productPage() {
    this.getProducts()
  }

  get products(): product[] {
    // this.getProducts()
    return (this.Products)
      .map((product, i) => ({id: i + 1, ...product}))
      .slice((this.page - 1) * this.pageSize, (this.page - 1) * this.pageSize + this.pageSize);
  }

}
