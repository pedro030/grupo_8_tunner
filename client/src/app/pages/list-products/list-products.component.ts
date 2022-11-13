import { Component, Input, OnInit } from '@angular/core';
import { Product } from 'src/app/Core/models/product.model';
import { ProductsService } from '../../Core/services/products.service';
// import { Store } from '@ngrx/store';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.scss']
})
export class ListProductsComponent implements OnInit {
  @Input() products?: Product[];

  constructor(private productsServ: ProductsService) { }

  ngOnInit(): void {
    this.products = prodArray;
    console.log(this.productsServ.getAllProducts());
  }

}

let prodArray: Product[] = [
  {
    id: 1,
    name: 'Caravana',
    price: 100,
    img: '',
    description: '',
    songs: []
  },
  {
    id: 2,
    name: 'Caravana',
    price: 100,
    img: '',
    description: '',
    songs: []
  },
  {
    id: 3,
    name: 'Caravana',
    price: 100,
    img: '',
    description: '',
    songs: []
  },
  {
    id: 3,
    name: 'Caravana',
    price: 100,
    img: '',
    description: '',
    songs: []
  },
  {
    id: 3,
    name: 'Caravana',
    price: 100,
    img: '',
    description: '',
    songs: []
  }
]

