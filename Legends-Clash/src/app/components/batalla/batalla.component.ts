import { Component, Input, OnInit } from '@angular/core';
import Batalla from '../../models/Batalla';
import { ApiService } from '../../services/api/api.service';
import { UserService } from '../../services/user/user.service';
import { PersonajeCartaComponent } from '../personaje/personaje.component';
import Voto from '../../models/Voto';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-batalla',
  imports: [PersonajeCartaComponent, CommonModule, RouterLink],
  templateUrl: './batalla.component.html',
})
export class BatallaComponent implements OnInit {
  @Input() batalla: any = {};
  votado = false;
  logged = false;
  votos: Voto[];
  votosEquipo1: number = 0;
  votosEquipo2: number = 0;
  cantidadDeVotos: number = 0;
  anchoEquipo1: string = "";
  anchoEquipo2: string = "";

  constructor(public api: ApiService, public userService: UserService) {
    this.votos = {} as Voto[];
  }

  ngOnInit(): void {
    this.api.getVotos(this.batalla.id).subscribe({
      next: (data) => {
        this.votos = data;
        this.cantidadDeVotos = this.votos.length;
        this.cantidadDeVotos = this.votos.length;
        if (this.userService.isLoggedIn()) {
      this.api.getVotoUsuario(this.batalla.id).subscribe({
        next: (data) => {
          if (Array.isArray(data) && data.length === 0) {

          } else {
            this.votado = true;
            const votosEquipo1 = this.votos.filter((voto: any) => voto.equipoVotado.id === this.batalla.equipo1.id);
            this.votosEquipo1 = votosEquipo1.length * 100 / this.cantidadDeVotos;
            const votosEquipo2 = this.votos.filter((voto: any) => voto.equipoVotado.id === this.batalla.equipo2.id);
            this.votosEquipo2 = votosEquipo2.length * 100 / this.cantidadDeVotos;
            this.anchoEquipo1 = this.votosEquipo1 + "%";
            this.anchoEquipo2 = this.votosEquipo2 + "%";
          }
        },
        error: (e) => console.log(e)
      });
      this.logged = true;
    } else {
      this.logged = false;
    }
      },
      error: (e) => console.log(e),
    });
  }

  votar (equipo_id: number) {
    this.api.votar(equipo_id, this.batalla.id).subscribe({
      next: (data) => this.ngOnInit(),
      error: (e) => console.log(e)
    })
  }
}
