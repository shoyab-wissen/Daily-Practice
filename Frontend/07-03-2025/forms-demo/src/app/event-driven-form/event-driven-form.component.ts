import { Component } from '@angular/core';

@Component({
  selector: 'app-event-driven-form',
  imports: [],
  templateUrl: './event-driven-form.component.html',
  styleUrl: './event-driven-form.component.css',
})
export class EventDrivenFormComponent {
  abc(event: Event) {
    event.preventDefault();
    console.log('Event:', event);
  }
}
