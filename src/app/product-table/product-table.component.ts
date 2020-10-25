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
  
  constructor(
    private productService: ProductService
  ) { }

  ngOnInit() {
    this.getProducts()
  }

  search($event): void {
    console.log($event.value);
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
