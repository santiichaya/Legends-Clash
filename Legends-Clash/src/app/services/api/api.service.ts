import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Personaje from '../../models/Personaje';
import LoginDTO from '../../models/LoginRequest';
import Usuario from '../../models/Usuario';
import Batalla from '../../models/Batalla';
import PersonajeUpdate from '../../models/PersonajeUpdate';
import LoginRequest from '../../models/LoginRequest';
import LoginResponse from '../../models/loginResponse';
import registerUsuario from '../../models/RegisterUsuario';

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

  getBatallas () {
    return this.http.get<Batalla[]>(`${this.API_URL}/api/batallas/getBatallas`);
  }

  registerUsuario(usuario: registerUsuario) {
    return this.http.post<LoginResponse>(`${this.API_URL}/api/auth/register`, usuario);
  }

  updatePersonaje (personaje: PersonajeUpdate) {
    return this.http.patch<Personaje>(`${this.API_URL}/api/personajes/updatePersonaje`, personaje);
  }
}

