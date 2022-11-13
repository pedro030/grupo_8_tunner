import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private apiSrv: ApiService) { }

  // public getAll(){
  //   return new Observable((obs) => {
  //     this.apiSrv.get("products")
  //     .subscribe((res) => {
  //       obs.next(res);
  //     },
  //       (err) => obs.error(err),
  //       () => obs.complete()
  //     )
  //   })
  // }

  public getAllProducts(){
    return this.apiSrv.get("products");
  }
}
