import { Component, Input } from '@angular/core';
import Batalla from '../../models/Batalla';

@Component({
  selector: 'app-batalla',
  imports: [],
  templateUrl: './batalla.component.html',
  styleUrl: './batalla.component.css'
})
export class BatallaComponent {

  @Input() batalla: Batalla = {} as Batalla;

  constructor () {
    
  }
}
