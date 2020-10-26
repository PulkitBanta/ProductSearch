import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  id: number
  product: Product

  constructor(
    private router: ActivatedRoute,
    private productService: ProductService
  ) { }

  ngOnInit(): void {
    // getting id of currently activated route
    this.id = this.router.snapshot.params['id'];

    this.getProduct(this.id);
  }

  getProduct(id: number) {
    this.productService.getProduct(this.id).subscribe(res => {
      this.product = res;
    }, error => {
      console.log(error);
    });
  }

}
