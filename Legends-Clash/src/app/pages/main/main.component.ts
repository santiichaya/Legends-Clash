import { Component, OnInit } from '@angular/core';
import { PersonajeCartaComponent } from '../../components/personaje/personaje.component';
import { ApiService } from '../../services/api/api.service';
import Personaje from '../../models/Personaje';
import { Subscription } from 'rxjs';
import { Router } from '@angular/router';
import Batalla from '../../models/Batalla';
import { BatallaComponent } from "../../components/batalla/batalla.component";
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-main',
  imports: [PersonajeCartaComponent, BatallaComponent, MatIconModule],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent implements OnInit {

  currentRoute: string;
  tipo: boolean;
  personajes: Personaje[] | null;
  batallas: Batalla[] | null;

  constructor(public api: ApiService, public route: Router) {
    this.personajes = null;
    this.batallas = null;
    this.tipo = true;
    this.currentRoute = this.route.url;
  }

  ngOnInit(): void {
    if (this.currentRoute === '/personajes') {
      this.api.getPersonajes().subscribe({
        next: (data) => {
          this.personajes = data;
        },
        error: (e) => console.log(e)
      });
    } else if (this.currentRoute === '/batallas') {
      this.tipo = false;
      this.api.getBatallas().subscribe({
        next: (data) => {
          this.batallas = data;
        },
        error: (e) => console.log(e)
      });
    }
    console.log(this.tipo);
  }
}

