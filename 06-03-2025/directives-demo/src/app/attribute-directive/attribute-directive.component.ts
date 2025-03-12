import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  imports: [CommonModule],
  templateUrl: './attribute-directive.component.html',
  styleUrl: './attribute-directive.component.css',
})
export class AttributeDirectiveComponent {
  isHighlighted = false;
  isBordered = false;
  color: string = 'red';

  toggleHighlight() {
    this.isHighlighted = !this.isHighlighted;
  }
  toggleBorder() {
    this.isBordered = !this.isBordered;
  }
  changeColor(arg0: string) {
    this.color = arg0;
  }
}
