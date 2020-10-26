import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { ProductService } from '../product.service'
import { Product } from '../product'

@Component({
  selector: 'app-product-grid',
  templateUrl: './product-grid.component.html',
  styleUrls: ['./product-grid.component.css']
})

export class ProductGridComponent implements OnInit {

  products$: Product[] = [];
  searchQuery = true;
  
  constructor(
    private productService: ProductService,
    private router: Router,
    private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(data => {
      console.log(data.query);
      // this.getProducts(data.query);
    })
    this.getProducts()
  }

  search(searchQuery: string): void {
    this.router.navigate(['products'], {queryParams: {query: searchQuery}});
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
