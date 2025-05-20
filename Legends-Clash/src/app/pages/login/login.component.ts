import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms'
import { MatIconModule } from '@angular/material/icon';
import { ApiService } from '../../services/api/api.service';
import { UserService } from '../../services/user/user.service';

@Component({
  selector: 'app-login',
  imports: [ReactiveFormsModule, MatIconModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  loginform: FormGroup | null;
  password = true;

  constructor(public api: ApiService, public user: UserService) {
    this.loginform = null;
  }

  ngOnInit(): void {
    this.loginform = new FormGroup({
      nombre: new FormControl('', Validators.required),
      contrasena: new FormControl('', Validators.required)
    })
  }

  login() {
    let usuario = this.api.validarUsuario(this.loginform?.value);
    usuario.subscribe({
      next: (data) => this.user.setUsuario(data),
      error: (e) => console.log(e)
    })
  }

  toggleInput(value: boolean) {
    this.password = value;
  }
}
