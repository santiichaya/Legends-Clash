import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Personaje from '../models/Personaje';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  readonly API_URL = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  getPersonajes() {
    return this.http.get<Personaje[]>(`${this.API_URL}/api/personajes/getPersonajes`);
  }

  getPersonaje(idPersonaje: string | null) {
    return this.http.get<Personaje>(`${this.API_URL}/api/personajes/getPersonaje/${idPersonaje}`,);
  }
}
