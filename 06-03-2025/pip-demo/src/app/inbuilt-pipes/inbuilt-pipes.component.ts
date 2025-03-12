import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-inbuilt-pipes',
  templateUrl: './inbuilt-pipes.component.html',
  styleUrl: './inbuilt-pipes.component.css',
  standalone: false,
})
export class InbuiltPipesComponent {
  str: string = 'Hello, World!';
  amt: number = 12345.6789;
  dt: Date = new Date();
}
