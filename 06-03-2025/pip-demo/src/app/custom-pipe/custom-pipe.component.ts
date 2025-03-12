import { Component } from '@angular/core';
import { SquarePipe } from '../pipe/square.pipe';
import { PowerPipe } from '../pipe/power.pipe';

@Component({
  selector: 'app-custom-pipe',
  templateUrl: './custom-pipe.component.html',
  styleUrl: './custom-pipe.component.css',
  standalone: false,
})
export class CustomPipeComponent {}
