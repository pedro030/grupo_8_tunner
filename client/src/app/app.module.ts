import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

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

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FooterComponent,
    MainComponent,
    CardProductComponent,
    ProductDetailComponent,
    ListProductsComponent
  ],
  imports: [
    BrowserModule,
    StoreModule.forRoot({}, {}),
    StoreDevtoolsModule.instrument({ maxAge: 25, logOnly: environment.production }),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
