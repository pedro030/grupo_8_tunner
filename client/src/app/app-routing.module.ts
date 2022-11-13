import {NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminPanelComponent } from './pages/admin-panel/admin-panel.component';
import { ListProductsComponent } from './pages/list-products/list-products.component';
import { LoginComponent } from './pages/login/login.component';
import { MainComponent } from './pages/main/main.component';
import { ProductDetailComponent } from './pages/product-detail/product-detail.component';
import { SigninComponent } from './pages/signin/signin.component';

const routes: Routes = [
    { path: '', component: MainComponent},
    { path: 'products', component: ListProductsComponent },
    { path: 'login', component: LoginComponent },
    { path: 'signin', component: SigninComponent },
    { path: 'products/:id', component: ProductDetailComponent },
    { path: 'admin', component: AdminPanelComponent},
    { path: '**', redirectTo: ''}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}