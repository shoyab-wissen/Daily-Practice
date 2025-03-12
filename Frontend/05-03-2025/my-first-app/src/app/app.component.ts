import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { ParentComponent } from './parent/parent.component';
import { SiblingComponent } from './sibling/sibling.component';
import { MyCompComponent } from './my-comp/my-comp.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ParentComponent, SiblingComponent, MyCompComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'my-first-app';
}
