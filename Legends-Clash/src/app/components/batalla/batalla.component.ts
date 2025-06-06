import { Component, Input, OnInit } from '@angular/core';
import Batalla from '../../models/Batalla';
import { ApiService } from '../../services/api/api.service';
import { UserService } from '../../services/user/user.service';

@Component({
  selector: 'app-batalla',
  imports: [],
  templateUrl: './batalla.component.html',
  styleUrl: './batalla.component.css'
})
export class BatallaComponent implements OnInit{

  @Input() batalla: any = {};

  constructor (public api: ApiService, public userService: UserService) {

  }

  ngOnInit(): void {
    console.log(this.batalla);
  }
}
