import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCustomFor]',
})
export class CustomForDirective {
  constructor(private element: ElementRef) {
    const data = this.element.nativeElement.innerText;
    this.element.nativeElement.innerHTML = '';
    for (let i = 0; i < 10; i++) {
      this.element.nativeElement.innerHTML += `<li>${data}</li>`;
    }
  }
}
