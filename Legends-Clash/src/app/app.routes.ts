import { Routes } from '@angular/router';
import { MainComponent } from './pages/main/main.component';
import { PersonajeCartaComponent } from './components/personaje/personaje.component';
import { PersonajeComponent } from './pages/personaje/personaje.component';

export const routes: Routes = [
    {path: "personajes", component: MainComponent, data: {name: "personajes", title: "Legends Clash"}},
    {path: "batallas", component: MainComponent, data: {name: "batallas", title: "Legends Clash"}},
    {path: "personaje/:id", component: PersonajeComponent, data: {name: "personaje"}},
    {path: "", redirectTo: "personajes", pathMatch: 'full'},
];
