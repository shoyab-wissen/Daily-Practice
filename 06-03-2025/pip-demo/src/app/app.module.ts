import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { RouterOutlet } from '@angular/router';
import { InbuiltPipesComponent } from './inbuilt-pipes/inbuilt-pipes.component';
import { CustomPipeComponent } from './custom-pipe/custom-pipe.component';
import { SquarePipe } from './pipe/square.pipe';
import { PowerPipe } from './pipe/power.pipe';

@NgModule({
  declarations: [InbuiltPipesComponent, CustomPipeComponent],
  imports: [RouterOutlet, CommonModule, SquarePipe, PowerPipe],
  bootstrap: [AppComponent, InbuiltPipesComponent, CustomPipeComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class AppModule {}
