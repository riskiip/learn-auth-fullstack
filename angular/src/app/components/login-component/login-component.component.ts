import { Component, OnInit } from '@angular/core';
import {WebRequestService} from "../../services/web-request.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.scss']
})
export class LoginComponentComponent implements OnInit {

  username: string;
  password: string;
  message: any;

  constructor(
    private webRequest: WebRequestService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  doLogin() {
    const response = this.webRequest.login(this.username, this.password);
    response.subscribe(data => {
      this.message = data;
      this.router.navigate(['/home'])
      alert("Login Sukses! halo " + this.username + "!");
    });
  }

}
