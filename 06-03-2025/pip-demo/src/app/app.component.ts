import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { InbuiltPipesComponent } from './inbuilt-pipes/inbuilt-pipes.component';
import { CustomPipeComponent } from './custom-pipe/custom-pipe.component';
import { AppModule } from './app.module';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  standalone: false,
})
export class AppComponent {
  title = 'pip-demo';
}
