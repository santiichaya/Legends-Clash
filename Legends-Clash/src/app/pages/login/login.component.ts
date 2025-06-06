import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms'
import { MatIconModule } from '@angular/material/icon';
import { ApiService } from '../../services/api/api.service';
import { UserService } from '../../services/user/user.service';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [ReactiveFormsModule, MatIconModule, RouterLink],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  loginform: FormGroup | null;
  password = true;
  errorLogin = false;

  constructor(public api: ApiService, public user: UserService, public router: Router) {
    this.loginform = null;
  }

  ngOnInit(): void {
    this.loginform = new FormGroup({
      username: new FormControl('', Validators.required),
      password: new FormControl('', Validators.required)
    })
  }

  login() {
    let usuario = this.user.login(this.loginform?.value);
    usuario.subscribe({
      next: (data) => {
        console.log(data);
        this.router.navigate(["/"])
      },
      error: (e) => {
        console.log(e);
        this.errorLogin = true
      }
    })
  }

  toggleInput(value: boolean) {
    this.password = value;
  }
}
