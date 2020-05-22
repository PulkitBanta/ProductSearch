import { Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { product } from './product'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService{

  constructor(
    private http : HttpClient
  ) { }

  getProducts(): Observable<product[]> {
    return this.http.get<product[]>('/api/allProducts')
  }

  getProduct(size): Observable<product[]> {
    return this.http.get<product[]>('/api/allProducts' + 'product/' + size)
  }
}
