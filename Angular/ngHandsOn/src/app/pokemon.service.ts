import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { Pokemon } from './pokemon';
@Injectable({
  providedIn: 'root'
})
export class PokemonService {

  constructor(private http: HttpClient) { }

  private url = 'http://api.skilldistillery.com:8080/poke/data/poke';

index() {
  return this.http.get<Pokemon[]>(this.url + '?sorted=true')
       .pipe(
         catchError((err: any) => {
          console.log(err);
          return throwError('KABOOM');
        })
    );
}
create(poke) {
  return this.http.post<Pokemon[]>(this.url, poke)
       .pipe(
         catchError((err: any) => {
          console.log(err);
          return throwError('KABOOM');
        })
    );
}

}
