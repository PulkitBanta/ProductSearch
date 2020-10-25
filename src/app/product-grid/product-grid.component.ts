import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service'
import { Product } from '../product'

@Component({
  selector: 'app-product-grid',
  templateUrl: './product-grid.component.html',
  styleUrls: ['./product-grid.component.css']
})

export class ProductGridComponent implements OnInit {

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
        console.log(this.products$);
      },
      error => {
        console.log(error)
      }
    )
  }

}
