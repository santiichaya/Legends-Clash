import { Component } from '@angular/core';
import {
  AbstractControl,
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  ValidationErrors,
  Validators,
} from '@angular/forms';
import { ApiService } from '../../services/api/api.service';
import { UserService } from '../../services/user/user.service';
import { MatIconModule } from '@angular/material/icon';
import { Router, RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import LoginRequest from '../../models/LoginRequest';

@Component({
  selector: 'app-register',
  imports: [MatIconModule, ReactiveFormsModule, RouterLink, CommonModule],
  templateUrl: './register.component.html',
})
export class RegisterComponent {
  registerForm: FormGroup | null;
  password1 = true;
  password2 = true;
  mensajeError = '';

  constructor(
    public api: ApiService,
    public user: UserService,
    public router: Router
  ) {
    this.registerForm = null;
  }

  ngOnInit(): void {
    this.registerForm = new FormGroup(
      {
        username: new FormControl('', Validators.required),
        email: new FormControl('', [Validators.required, Validators.email]),
        password: new FormControl('', Validators.required),
        password2: new FormControl('', Validators.required),
      },
      { validators: this.passwordMatchValidator }
    );
  }

  register() {
    let usuario = this.api.registerUsuario(this.registerForm?.value);
    usuario.subscribe({
      next: (data) => {
        const usuarioLogin = {} as LoginRequest;
        usuarioLogin.username = this.registerForm?.value.username;
        usuarioLogin.password = this.registerForm?.value.password;
        this.user.login(usuarioLogin).subscribe({
          next: () => this.router.navigate(['/']),
          error: (e) => console.log(e),
        });
      },
      error: (e) => {
        this.mensajeError = e.error;
      },
    });
  }

  toggleInput1(value: boolean) {
    this.password1 = value;
  }

  toggleInput2(value: boolean) {
    this.password2 = value;
  }

  passwordMatchValidator(control: AbstractControl): ValidationErrors | null {
    const password = control.get('password')?.value;
    const password2 = control.get('password2')?.value;

    return password === password2 ? null : { passwordMismatch: true };
  }
}
