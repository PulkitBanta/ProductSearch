import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service'
import { product } from '../product'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  Products: product[] = [];

  constructor(
    private productService: ProductService
  ) { 
    this.productService.getProducts()
    .subscribe(res =>
      this.Products = res
    )
  }

  page = 1;
  pageSize = 4;
  collectionSize = this.Products.length;

  ngOnInit(): void { 
    
  }

  get products(): product[] {
    return this.Products
      .map((product, i) => ({id: i + 1, ...product}))
      .slice((this.page - 1) * this.pageSize, (this.page - 1) * this.pageSize + this.pageSize);
  }

}
