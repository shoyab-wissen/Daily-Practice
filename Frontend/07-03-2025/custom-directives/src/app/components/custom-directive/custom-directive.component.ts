import { Component } from '@angular/core';
import { MyStyleDirective } from '../../directives/my-style.directive';
import { CustomForDirective } from '../../directives/custom-for.directive';

@Component({
  selector: 'app-custom-directive',
  imports: [MyStyleDirective, CustomForDirective],
  templateUrl: './custom-directive.component.html',
  styleUrl: './custom-directive.component.css',
})
export class CustomDirectiveComponent {}
