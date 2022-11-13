import { Component, OnInit, Input} from '@angular/core';
import { Product } from 'src/app/Core/models/product.model';

@Component({
  selector: 'app-card-product',
  templateUrl: './card-product.component.html',
  styleUrls: ['./card-product.component.scss']
})
export class CardProductComponent implements OnInit {
  @Input() product?: Product;
  constructor() { }

  ngOnInit(): void {
  }

}
