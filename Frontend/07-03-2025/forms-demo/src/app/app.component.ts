import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TemplateDrivenComponent } from './template-driven/template-driven.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { EventDrivenFormComponent } from './event-driven-form/event-driven-form.component';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    TemplateDrivenComponent,
    ReactiveFormComponent,
    EventDrivenFormComponent,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'forms-demo';
}
