import { Component, OnInit } from '@angular/core';
import { PRODUCTS } from '../products'

@Component({
  selector: 'app-product-table',
  templateUrl: './product-table.component.html',
  styleUrls: ['./product-table.component.css']
})

export class ProductTableComponent implements OnInit {

  constructor() { }

  products

  ngOnInit(): void {
    this.products = PRODUCTS;
  }

}
