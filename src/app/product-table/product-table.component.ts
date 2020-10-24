import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service'
import { Product } from '../product'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  private products$: Product[] = [];
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

  search(): void {
    if(this.query == "")
      this.getProducts()
    else {
      this.productService.search(this.query, this.offset, this.limit).subscribe(
        res => {
          this.products$ = res
          this.productService.sort(this.products$)
        }
      )
    }
  }

  getProducts(): void {
    this.productService.getProducts(this.page - 1).subscribe(
      res => { 
        this.products$ = res
        this.productService.sort(this.products$)
      },
      (error) => { console.log(error) }
    )
  }

  getPageSize(): void {
    this.productService.getSize().subscribe(
      res => {
        this.collectionSize = Number(res)
      }
    )
  }

}
