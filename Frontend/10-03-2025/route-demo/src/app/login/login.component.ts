import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RoleService } from '../services/role.service';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css',
})
export class LoginComponent {
  constructor(private router: Router, private roleService: RoleService) {}
  onSubmit(event: any) {
    event.preventDefault();
    console.log(event);

    let email = event.target.elements[0].value;
    let password = event.target.elements[1].value;
    this.roleService.role = event.target.elements[2].value;
    console.log(this.roleService.role);

    console.log(email, password);

    if (email == password) {
      this.router.navigate(['/welcome']);
    } else {
      alert('Invalid credentials');
    }
  }
}
