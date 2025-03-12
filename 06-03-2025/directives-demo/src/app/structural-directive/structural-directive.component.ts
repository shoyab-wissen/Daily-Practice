import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-structural-directive',
  imports: [CommonModule, FormsModule],
  templateUrl: './structural-directive.component.html',
  styleUrl: './structural-directive.component.css',
})
export class StructuralDirectiveComponent {
  show: boolean = false;
  brightness: number = 0;
  toggleShow() {
    this.show = !this.show;
  }
}
