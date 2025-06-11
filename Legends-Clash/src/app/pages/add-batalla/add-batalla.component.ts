import { Component } from '@angular/core';
import {
  FormControl,
  FormGroup,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';
import { ApiService } from '../../services/api/api.service';
import Personaje from '../../models/Personaje';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { PersonajeCartaComponent } from '../../components/personaje/personaje.component';

@Component({
  selector: 'app-add-batalla',
  imports: [ReactiveFormsModule, CommonModule, PersonajeCartaComponent],
  templateUrl: './add-batalla.component.html',
})
export class AddBatallaComponent {
  form: FormGroup = new FormGroup({
    nombre: new FormControl('Batalla', Validators.required),
    nombreEquipo1: new FormControl('equipo 1', Validators.required),
    nombreEquipo2: new FormControl('equipo 2', Validators.required),
    personaje11: new FormControl(null, Validators.required),
    personaje12: new FormControl(''),
    personaje13: new FormControl(''),
    personaje14: new FormControl(''),
    personaje21: new FormControl(null, Validators.required),
    personaje22: new FormControl(''),
    personaje23: new FormControl(''),
    personaje24: new FormControl(''),
  });
  personajes: Personaje[] = [];

  constructor(public api: ApiService, public router: Router) {
    api.getPersonajes().subscribe({
      next: (data) => {
        this.personajes = data;
      },
      error: (e) => {
        console.log(e);
      },
    });
  }

  getPersonaje(id: number): Personaje {
    const personaje = this.personajes.find(
      (p) => p.id.toString() === id.toString()
    );
    if (!personaje) {
      throw new Error(`Personaje con ID ${id} no encontrado`);
    }
    return personaje;
  }

  addBatalla() {
    console.log(this.form.value);
    this.api.createBatalla(this.form.value).subscribe({
      next: (data) => {
        console.log(data);
        this.router.navigate(['/batallas']);
      },
      error: (e) => console.log(e),
    });
  }

  mostrarPersonaje12(): boolean {
    return !!this.form.get('personaje11')?.value;
  }

  mostrarPersonaje13(): boolean {
    return !!this.form.get('personaje12')?.value;
  }

  mostrarPersonaje14(): boolean {
    return !!this.form.get('personaje13')?.value;
  }

  mostrarPersonaje22(): boolean {
    return !!this.form.get('personaje21')?.value;
  }

  mostrarPersonaje23(): boolean {
    return !!this.form.get('personaje22')?.value;
  }

  mostrarPersonaje24(): boolean {
    return !!this.form.get('personaje23')?.value;
  }
}
