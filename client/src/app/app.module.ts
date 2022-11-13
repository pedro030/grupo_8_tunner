import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

// services
import {ProductsService} from './Core/services/products.service';

import { AppComponent } from './app.component';
import { NavComponent } from './pages/components/nav/nav.component';
import { FooterComponent } from './pages/components/footer/footer.component';
import { MainComponent } from './pages/main/main.component';
import { CardProductComponent } from './pages/components/card-product/card-product.component';
import { ProductDetailComponent } from './pages/product-detail/product-detail.component';
import { ListProductsComponent } from './pages/list-products/list-products.component';
import { StoreModule } from '@ngrx/store';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { environment } from '../environments/environment';

import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './pages/login/login.component';
import { SigninComponent } from './pages/signin/signin.component';
import { AdminPanelComponent } from './pages/admin-panel/admin-panel.component';
import { AdminProductsComponent } from './pages/components/admin-products/admin-products.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FooterComponent,
    MainComponent,
    CardProductComponent,
    ProductDetailComponent,
    ListProductsComponent,
    LoginComponent,
    SigninComponent,
    AdminPanelComponent,
    AdminProductsComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    StoreModule.forRoot({}, {}),
    StoreDevtoolsModule.instrument({ maxAge: 25, logOnly: environment.production }),
    HttpClientModule
  ],
  providers: [ProductsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
