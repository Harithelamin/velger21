import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../user';

const AUTH_API = 'http://localhost:8092/auth/';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  [x: string]: any;
  User:[];

  constructor(private http: HttpClient) { }

  login(user): Observable<any> {
    return this.http.post(AUTH_API + 'signin', {
      username: user.username,
      password: user.password
    }, httpOptions);
  }  

  register(user): Observable<any> {
    return this.http.post(AUTH_API + 'registerUser', user, httpOptions);
  } 

  getAllUsers(): Observable<User[]>{
    return this.http.get<User[]>(AUTH_API +'getAllUsers', httpOptions)
  }

  
}
