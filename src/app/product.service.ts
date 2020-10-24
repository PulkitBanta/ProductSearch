import { Injectable} from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Product } from './product'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService{

  private baseURL: string = "/api"

  constructor(
    private http : HttpClient
  ) { }

  // initial data
  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.baseURL}/product/all`)
  }
}
