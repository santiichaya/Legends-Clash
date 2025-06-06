import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ApiService } from '../../services/api/api.service';
import { UserService } from '../../services/user/user.service';
import { MatIconModule } from '@angular/material/icon';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-register',
  imports: [MatIconModule, ReactiveFormsModule, RouterLink],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css',
})
export class RegisterComponent {
  registerForm: FormGroup | null;
  password1 = true;
  password2 = true;

  constructor(public api: ApiService, public user: UserService) {
    this.registerForm = null;
  }

  ngOnInit(): void {
    this.registerForm = new FormGroup({
      username: new FormControl('', Validators.required),
      email: new FormControl('', Validators.required),
      password: new FormControl('', Validators.required),
      password2: new FormControl('', Validators.required),
    });
  }

  register() {
    let usuario = this.api.registerUsuario(this.registerForm?.value);
    usuario.subscribe({
      next: (data) => console.log(data),
      error: (e) => console.log(e),
    });
  }

  toggleInput1(value: boolean) {
    this.password1 = value;
  }

  toggleInput2(value: boolean) {
    this.password2 = value;
  }
}
