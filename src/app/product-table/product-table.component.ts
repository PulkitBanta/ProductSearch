import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service'
import { Product } from '../product'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  products$: Product[] = [];
  query: string;
  
  constructor(
    private productService: ProductService
  ) { }

  ngOnInit() {
    this.getProducts()
  }

  search(): void {
    // if(this.query !== "") {
    //   // add method to get the products data with query
    // }
  }

  getProducts(): void {
    this.productService.getProducts().subscribe(
      res => { 
        this.products$ = res
      },
      error => {
        console.log(error)
      }
    )
  }

}
