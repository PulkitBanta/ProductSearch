import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { ProductService } from '../product.service'
import { Product } from '../product'
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-product-grid',
  templateUrl: './product-grid.component.html',
  styleUrls: ['./product-grid.component.css']
})

export class ProductGridComponent implements OnInit, OnDestroy {

  private subscription: Subscription
  products$: Product[] = [];
  searchQuery: string;
  
  constructor(
    private productService: ProductService,
    private router: Router,
    private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit() {
    this.activatedRoute.queryParams.subscribe(data => {
      this.searchQuery = data.query;
      
      if(this.searchQuery !== undefined) {
        this.getSearchedProducts(this.searchQuery)
      } else {
        this.getProducts()
      }
    })
  }

  search(searchQuery: string): void {
    this.router.navigate(['products'], {queryParams: {query: searchQuery}});
    // this.getSearchedProducts
  }

  getProducts(): void {
    this.subscription = this.productService.getProducts().subscribe(
      res => { 
        this.products$ = res
      },
      error => {
        console.log(error)
      }
    )
  }

  getSearchedProducts(query: string) {
    this.subscription = this.productService.getSearchProducts(query).subscribe(data => {
      this.products$ = data;
    }, error => {
      console.log(error);
    })
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }

}
