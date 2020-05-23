import { Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { product } from './product'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService{

  private baseURL: string = "http://localhost:8080"

  constructor(
    private http : HttpClient
  ) { }

  getProducts(page: number): Observable<product[]> {
    return this.http.get<product[]>(this.baseURL + '/products/list?page=' + page)
  }

  getSize(){
    return this.http.get(this.baseURL + '/products/size')
  }

  search(q, offset, limit): Observable<product[]> {
    return this.http.get<product[]>("http://localhost:8080/products/list/search?query=" + q + "&offset=" + offset + "&limit=" + limit)
  }
}
