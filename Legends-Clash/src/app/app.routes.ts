import { Routes } from '@angular/router';
import { MainComponent } from './pages/main/main.component';
import { PersonajeComponent } from './pages/personaje/personaje.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';

export const routes: Routes = [
    {path: "personajes", component: MainComponent, data: {name: "personajes", title: "Legends Clash"}},
    {path: "batallas", component: MainComponent, data: {name: "batallas", title: "Legends Clash"}},
    {path: "personaje/:id", component: PersonajeComponent, data: {name: "personaje"}},
    {path: "login", component: LoginComponent, data: {name: "login"}},
    {path: "register", component: RegisterComponent, data: {name: "register"}},
    {path: "", redirectTo: "personajes", pathMatch: 'full'},
];
