import { Component, OnInit } from '@angular/core';
import { PRODUCTS } from '../products'
import { product } from '../product'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  constructor() { }

  page = 1;
  pageSize = 4;
  collectionSize = PRODUCTS.length;

  ngOnInit(): void { }

  get products(): product[] {
    return PRODUCTS
      .map((product, i) => ({id: i + 1, ...product}))
      .slice((this.page - 1) * this.pageSize, (this.page - 1) * this.pageSize + this.pageSize);
  }

}
