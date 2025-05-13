import { Routes } from '@angular/router';
import { MainComponent } from './pages/main/main.component';

export const routes: Routes = [
    {path: "personajes", component: MainComponent, data: {name: "personajes"}},
    {path: "batallas", component: MainComponent, data: {name: "batallas"}},
    {path: "", redirectTo: "personajes", pathMatch: 'full'},
];
