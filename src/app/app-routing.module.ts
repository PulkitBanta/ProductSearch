import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { ProductGridComponent } from './product-grid/product-grid.component';


const routes: Routes = [
  {path:"", redirectTo: 'products', pathMatch: 'full'},
  {path: 'products', component: ProductGridComponent},
  {path: 'products/:id', component: ProductDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
