import {Component, OnInit} from '@angular/core';
import {WebRequestService} from "../../services/web-request.service";

@Component({
  selector: 'app-home-component',
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.scss']
})
export class HomeComponentComponent implements OnInit {
  users: any;
  isClicked = false;

  constructor(private webRequest: WebRequestService) {
  }

  ngOnInit() {
  }

  getUsers() {
    this.isClicked = !this.isClicked;
    const response = this.webRequest.getUsers();
    response.subscribe(data => {
      this.users = data
    })
  }

}
