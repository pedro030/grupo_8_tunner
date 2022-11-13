import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) {}

  // get(endpoint: string): Observable<any>{
  //   const finalUrl = environment.URL_API_BASIC + endpoint;
  //   return new Observable((obs) => {
  //     this.http.get(finalUrl).subscribe(
  //       (res) => {
  //         obs.next(res);
  //     },
  //     (err: HttpErrorResponse) => {
  //       console.log(err.error);
  //       obs.error(err.error);
  //       obs.complete();
  //     }
  //     )
  //   })
  // }
  get(endpoint: string){
    console.log('api serv');
    return this.http.get(`${environment.URL_API_BASIC}${endpoint}`);
  }

}
