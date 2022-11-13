import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import {loadProducts} from '../../state/actions/products.actions';
// prueba
import {ProductsService} from '../../Core/services/products.service';
import { Product } from 'src/app/Core/models/product.model';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent implements OnInit {
  products: Product[] = [];

  constructor(private store: Store<any>, private productsService: ProductsService) { }

  ngOnInit(): void {
    this.store.dispatch(loadProducts());
  }

}
