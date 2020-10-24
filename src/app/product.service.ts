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

  // initial data
  getProducts(page: number): Observable<Product[]> {
    return this.http.get<Product[]>(this.baseURL + '/products/list?page=' + page)
  }

  // total size of the data
  getSize(): any{
    return this.http.get(this.baseURL + '/products/size')
  }

  // returning the searched query
  search(q, offset, limit): Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:8080/products/list/search?query=" + q + "&offset=" + offset + "&limit=" + limit)
  }

  // sorting of the products array
  sort(products: Product[]) {
    return products.sort((a: Product, b: Product) => {
      if(a.name > b.name)
        return 1;
      return 0;
    });
  }
}
