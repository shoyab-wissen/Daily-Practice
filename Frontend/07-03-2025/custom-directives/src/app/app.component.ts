import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CustomDirectiveComponent } from './components/custom-directive/custom-directive.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CustomDirectiveComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'custom-directives';
}
