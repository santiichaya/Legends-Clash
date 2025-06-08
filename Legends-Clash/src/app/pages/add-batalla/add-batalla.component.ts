import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ApiService } from '../../services/api/api.service';
import Personaje from '../../models/Personaje';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add-batalla',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './add-batalla.component.html',
  styleUrl: './add-batalla.component.css'
})
export class AddBatallaComponent {
  form: FormGroup = new FormGroup ({
    nombre: new FormControl ('Batalla', Validators.required),
    nombreEquipo1: new FormControl ('equipo 1', Validators.required),
    nombreEquipo2: new FormControl ('equipo 2', Validators.required),
    personaje11: new FormControl (null, Validators.required),
    personaje12: new FormControl (''),
    personaje13: new FormControl (''),
    personaje14: new FormControl (''),
    personaje21: new FormControl (null, Validators.required),
    personaje22: new FormControl (''),
    personaje23: new FormControl (''),
    personaje24: new FormControl (''),
  })
  personajes: Personaje[] = [];

  constructor (public api: ApiService) {
    api.getPersonajes().subscribe({
      next: (data) => {
        this.personajes = data;
      },
      error: (e) => {
        console.log(e);
      }
    })
  }

  addBatalla () {
    console.log(this.form.value);
    this.api.createBatalla(this.form.value).subscribe({
      next: (data) => console.log(data),
      error: (e) => console.log(e)
    });
  }
}
