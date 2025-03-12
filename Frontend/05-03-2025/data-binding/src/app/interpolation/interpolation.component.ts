import { Component } from '@angular/core';

@Component({
  selector: 'app-interpolation',
  imports: [],
  templateUrl: './interpolation.component.html',
  styleUrl: './interpolation.component.css'
})
export class InterpolationComponent {
  private name: string = 'John Doe';
  private age: number = 30;
  greet: string = 'Yo!'
  greeting(): string {
    return `Hello, my name is ${this.name} and I am ${this.age} years old.`;
  }
}
