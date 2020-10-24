import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductTableComponent } from './product-table/product-table.component';


const routes: Routes = [
  {path:"", redirectTo: 'app/products', pathMatch: 'full'},
  {path: 'app/products', component: ProductTableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
