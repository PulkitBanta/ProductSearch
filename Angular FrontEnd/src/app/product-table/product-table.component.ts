import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service'
import { product } from '../product'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  private Products: product[] = [];
  private page = 1;
  private collectionSize;
  private query: string;
  private offset: number = 0;
  private limit: number = 10;
  
  constructor(
    private productService: ProductService
  ) { }

  ngOnInit() {
    this.getProducts()
    this.getPageSize()
  }

  search() {
    this.productService.search(this.query, this.offset, this.limit).subscribe(
      res => {
        this.Products = res
      }
    )
  }

  getProducts() {
    this.productService.getProducts(this.page - 1).subscribe(
      res => { 
        this.Products = res
      },
      (error) => { console.log(error) }
    )
  }

  getPageSize() {
    this.productService.getSize().subscribe(
      res => {
        this.collectionSize = Number(res)
      }
    )
  }

}
