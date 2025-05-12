import { Component } from '@angular/core';
import { PersonajeComponent } from '../../components/personaje/personaje.component';

@Component({
  selector: 'app-main',
  imports: [PersonajeComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  array = [
    "aquaman", 
    "aslan", 
    "batman", 
    "blackpanther", 
    "blackwidow", 
    "capitan", 
    "caspian", 
    "doctorstrange", 
    "flash", 
    "fortachon", 
    "greenlantern", 
    "han", 
    "hulk", 
    "ironman", 
    "leia", 
    "lucy", 
    "luke", 
    "megatron", 
    "optimusprime", 
    "papa_pitufo", 
    "patoso", 
    "peter", 
    "pitufina", 
    "spiderman", 
    "superman", 
    "susan", 
    "thor", 
    "vader", 
    "venom", 
    "yoda"
  ];
}
