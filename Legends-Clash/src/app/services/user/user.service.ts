import { Injectable } from '@angular/core';
import Usuario from '../../models/Usuario';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  usuario: Usuario | null;

  constructor() {
    this.usuario = null;
  }

  setUsuario(user: Usuario) {
    this.usuario = user;
  }
}
