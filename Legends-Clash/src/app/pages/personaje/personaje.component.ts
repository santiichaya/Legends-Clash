import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../services/api/api.service';
import Personaje from '../../models/Personaje';
import { Subscription } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { NgStyle } from '@angular/common';

@Component({
  selector: 'app-personaje',
  imports: [NgStyle],
  templateUrl: './personaje.component.html',
  styleUrl: './personaje.component.css'
})
export class PersonajeComponent implements OnInit {
  personaje: Personaje | null;
  routeSubscription: Subscription | null;
  idPersonaje: string | null = "";
  estilosSaga: string = ""

  constructor(private api: ApiService, private route: ActivatedRoute) {
    this.personaje = null;
    this.routeSubscription = null;
  }

  ngOnInit(): void {
    this.routeSubscription = this.route.paramMap.subscribe(params => {
      this.idPersonaje = params.get('id');
    })
    this.api.getPersonaje(this.idPersonaje).subscribe({
      next: (data) => {
        this.personaje = data;
        this.estilosSaga = this.personaje!.saga.toLowerCase().replace(/ /g, '');
        this.personaje!.nombre = this.personaje!.nombre.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
      },
      error: (e) => console.log(e)
    });

  }
}
