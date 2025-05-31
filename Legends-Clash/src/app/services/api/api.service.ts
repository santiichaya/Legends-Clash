import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Personaje from '../../models/Personaje';
import LoginDTO from '../../models/LoginRequest';
import Usuario from '../../models/Usuario';
import Batalla from '../../models/Batalla';
import PersonajeUpdate from '../../models/PersonajeUpdate';

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

  validarUsuario(usuario: LoginDTO) {
    return this.http.post<Usuario>(`${this.API_URL}/api/usuarios/validarUsuario`, usuario);
  }

  updatePersonaje (personaje: PersonajeUpdate) {
    console.log("AAAAA")
    console.log(`${this.API_URL}/api/personajes/updatePersonaje`);
    return this.http.patch<Personaje>(`${this.API_URL}/api/personajes/updatePersonaje`, personaje);
  }
}

