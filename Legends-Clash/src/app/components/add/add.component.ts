import { Component, Input } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-add',
  imports: [MatIconModule, RouterLink],
  templateUrl: './add.component.html',
})
export class AddComponent {

  constructor () {

  }
}
