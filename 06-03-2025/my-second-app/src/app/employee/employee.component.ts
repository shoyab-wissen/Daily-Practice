import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-employee',
  imports: [],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css',
})
export class EmployeeComponent {
  @Input({ alias: 'employeeName', required: true })
  name: string = 'Guest';
  @Input()
  age: number = 0;
}
