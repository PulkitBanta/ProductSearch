import { Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Product } from './product'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService{

  private baseURL: string = "http://localhost:8080"

  constructor(
    private http : HttpClient
  ) { }

  getProducts(page: number): Observable<Product[]> {
    return this.http.get<Product[]>(this.baseURL + '/products/list?page=' + page)
  }

  getSize(){
    return this.http.get(this.baseURL + '/products/size')
  }

  search(q, offset, limit): Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:8080/products/list/search?query=" + q + "&offset=" + offset + "&limit=" + limit)
  }
}
