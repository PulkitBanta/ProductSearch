import { Injectable, Query} from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http'
import { Product } from './product'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService{

  private baseURL: string = "/api/product"

  constructor(
    private http : HttpClient
  ) { }

  // initial data
  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.baseURL}/all`)
  }

  // product with particular id
  getProduct(id: number): Observable<Product> {
    return this.http.get<Product>(`${this.baseURL}/${id}`)
  }

  // searched products
  getSearchProducts(query: string): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.baseURL}/search`, {
      params: new HttpParams().set('query', query)
    });
  }
}
