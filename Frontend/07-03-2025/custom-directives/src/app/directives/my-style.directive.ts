import { Directive, ElementRef, OnInit } from '@angular/core';

@Directive({
  selector: '[appMyStyle]',
})
export class MyStyleDirective implements OnInit {
  constructor(private element: ElementRef) {}
  ngOnInit() {
    this.element.nativeElement.style.color = 'blue';
  }
}
