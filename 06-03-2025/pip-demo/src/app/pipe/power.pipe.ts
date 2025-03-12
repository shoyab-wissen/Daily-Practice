import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power',
})
export class PowerPipe implements PipeTransform {
  transform(value: number, ...args: number[]): unknown {
    return Math.pow(value, args[0]) || 0;
  }
}
