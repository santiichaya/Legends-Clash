import { Routes } from '@angular/router';
import { MainComponent } from './pages/main/main.component';

export const routes: Routes = [
    {path: "personajes", component: MainComponent},
    {path: "", redirectTo: "personajes", pathMatch: 'full'}
];
