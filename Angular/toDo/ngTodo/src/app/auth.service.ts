import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) {}

  login(username, password) {
    // Generate base 64 auth token
    const token = this.generateBasicAuthToken(username, password);
    const headers = new HttpHeaders()
    .set('Authorization', 'Basic ${token}');

    return this.http
      .get('http://localhost:8080/authenticate', {headers})
      .pipe(
        tap((res) => {
          localStorage.setItem('token' , token);
          return res;
        }),
        catchError((err: any) => {
          console.log(err);
          return throwError('KABOOM');
        })
      );
  }

  register(username, password, email) {
    const user = {
      'username': username,
      'password': password,
      'email': email
    }  ;
        // create request to register a new account
        return this.http.post('http://localhost:8080/register', user)
        .pipe(
            tap((res) => {  // create a user and then upon success, log them in
              this.login(username, password);
            }),
            catchError((err: any) => {
              console.log(err);
              return throwError('KABOOM');
            })
          );
  }

  logout() {
    localStorage.removeItem('token');
    if (!localStorage.getItem('token')) {
      return true;
    } else {
      return false;
    }
  }

  checkLogin() {
    if (localStorage.getItem('token')) {
      return true;
    }
    return false;
  }

  generateBasicAuthToken(username, password) {
    return btoa(`${username}:${password}`);
  }

  getToken() {
    return localStorage.getItem('token');
  }
}
