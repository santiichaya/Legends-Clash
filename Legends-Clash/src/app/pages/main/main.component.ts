import { Component, OnInit } from '@angular/core';
import { PersonajeCartaComponent } from '../../components/personaje/personaje.component';
import { ApiService } from '../../services/api/api.service';
import Personaje from '../../models/Personaje';

@Component({
  selector: 'app-main',
  imports: [PersonajeCartaComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent implements OnInit{

  personajes: Personaje[] | null;

  constructor ( public api: ApiService ) {
    this.personajes = null;
  }

  ngOnInit(): void {
    this.api.getPersonajes().subscribe({
        next: (data) => {
          this.personajes = data;
        },
        error: (e) => console.log(e)
      });
  }
}

