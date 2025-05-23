import { Component, Input, input, OnInit } from '@angular/core';
import Personaje from '../../models/Personaje';
import { NgClass, NgStyle } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-personaje',
  imports: [NgStyle, RouterLink],
  templateUrl: './personaje.component.html',
  styleUrl: './personaje.component.css'
})
export class PersonajeCartaComponent implements OnInit {
  @Input() personaje: Personaje = {} as Personaje;
  estilosSaga: string;

  constructor() {
    this.estilosSaga = "";
  }

  ngOnInit(): void {
    this.estilosSaga = this.personaje.saga.toLowerCase().replace(/ /g, '');
    this.personaje.nombre = this.personaje.nombre.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    console.log(this.personaje)
  }
}
