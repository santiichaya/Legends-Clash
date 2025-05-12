import { Component, Input, input, OnInit } from '@angular/core';

@Component({
  selector: 'app-personaje',
  imports: [],
  templateUrl: './personaje.component.html',
  styleUrl: './personaje.component.css'
})
export class PersonajeComponent implements OnInit{
  @Input() personaje: string;
  imagen: string;

  constructor () {
    this.imagen = "";
    this.personaje = "";
  }
  
  ngOnInit(): void {
      this.imagen = "assets/busto/" + this.personaje + ".jpg";
  }
}
