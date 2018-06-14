import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private auth: AuthService,
    private router: Router) { }

  ngOnInit() {
  }

  login(loginForm: NgForm) {
    const user = {
      password: String,
      username: String
    };
    user.username = loginForm.value.username;
    user.password = loginForm.value.password;

    this.auth.login(user.username, user.password).subscribe(
      data => this.router.navigateByUrl('todo'),
      err => console.log('Error logging in user')
    );
  }
}
