import { Component, inject, OnInit } from '@angular/core';
import { ApiService } from '../../services/api/api.service';
import Personaje from '../../models/Personaje';
import { Subscription } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { NgIf, NgStyle } from '@angular/common';
import { MatIconModule } from '@angular/material/icon';
import PersonajeUpdate from '../../models/PersonajeUpdate';
import { UserService } from '../../services/user/user.service';

@Component({
  selector: 'app-personaje',
  imports: [NgStyle, MatIconModule],
  templateUrl: './personaje.component.html',
  styleUrl: './personaje.component.css'
})
export class PersonajeComponent implements OnInit {
  personaje: Personaje | null;
  routeSubscription: Subscription | null;
  idPersonaje: string | null = "";
  estilosSaga: string = "";
  actualizado: boolean = false;
  stats: any = ["fuerza", "inteligencia", "resistencia", "velocidad", "agilidad", "carisma", "alcance", "experiencia"];

  constructor(private api: ApiService, private route: ActivatedRoute, public userService: UserService) {
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
        this.personaje!.descripcion = this.personaje!.descripcion.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
      },
      error: (e) => console.log(e)
    });
  }

  add(atributo: string) {
    const atr = atributo as keyof Personaje;
    this.personaje![atr]++;
    this.actualizado = true;
  }

  subtract(atributo: string) {
    const atr = atributo as keyof Personaje;
    this.personaje![atr]--;
    this.actualizado = true;
  }

  actualizar() {
    const update: PersonajeUpdate = {
      id: this.personaje!.id,
      nombre: this.personaje!.nombre,
      saga: this.personaje!.saga,
      descripcion: this.personaje!.descripcion,
      fuerza: this.personaje!.fuerza,
      inteligencia: this.personaje!.inteligencia,
      resistencia: this.personaje!.resistencia,
      velocidad: this.personaje!.velocidad,
      agilidad: this.personaje!.agilidad,
      carisma: this.personaje!.carisma,
      alcance: this.personaje!.alcance,
      altura: this.personaje!.altura,
      peso: this.personaje!.peso,
      experiencia: this.personaje!.experiencia,
    };
    this.api.updatePersonaje(update).subscribe({
      error: (e) => console.log(e)
    });
  }
}
