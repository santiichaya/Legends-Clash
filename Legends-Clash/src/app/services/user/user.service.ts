import { Injectable } from '@angular/core';
import Usuario from '../../models/Usuario';
import { HttpClient } from '@angular/common/http';
import { CookieService } from 'ngx-cookie-service';
import { BehaviorSubject, tap } from 'rxjs';
import LoginRequest from '../../models/LoginRequest';
import LoginResponse from '../../models/loginResponse';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  readonly API_URL = 'http://localhost:8080';
  private readonly TOKEN_KEY = 'jwtToken';
  private readonly USER_ROLES = 'authorities';
  public userRoles: string = "";
  public username: string = "";

  constructor(private http: HttpClient, private cookie: CookieService) {
    this.loadUserData();
  }

  private loadUserData(): void {
    const userData = this.cookie.get("authorities");
    if (userData) {
      const parsedData = userData;
      this.userRoles = parsedData;
    }
  }

  login(usuario: LoginRequest) {
    return this.http
      .post<any>(`${this.API_URL}/api/auth/login`, usuario)
      .pipe(
        tap((response) => {
          this.cookie.set(
            this.TOKEN_KEY,
            response.token,
            7,
            '/',
            '',
            true,
            'Strict'
          );
          this.cookie.set(
            this.USER_ROLES,
            response.authorities,
            7,
            '/',
            '',
            true,
            'Strict'
          );
          this.username = response.username;
          this.loadUserData();
        })
      );
  }

  getToken(): string {
    return this.cookie.get(this.TOKEN_KEY);
  }

  isLoggedIn(): boolean {
    return this.cookie.check(this.TOKEN_KEY);
  }

  logout() {
    this.cookie.delete(this.TOKEN_KEY, '/');
    this.cookie.delete(this.USER_ROLES, '/');
    this.username="";
    this.userRoles="";
  }
}
