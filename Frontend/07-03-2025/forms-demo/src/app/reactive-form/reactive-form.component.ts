import { Component } from '@angular/core';
import {
  FormControl,
  FormGroup,
  FormsModule,
  ReactiveFormsModule,
  Validators,
} from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  imports: [FormsModule, ReactiveFormsModule],
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css',
})
export class ReactiveFormComponent {
  employeeForm: FormGroup = new FormGroup({
    name: new FormControl('Guest'),
    age: new FormControl(
      '',
      Validators.compose([
        Validators.required,
        Validators.min(18),
        Validators.max(21),
      ])
    ),
    salary: new FormControl('', Validators.required),
    designation: new FormControl('Developer'),
  });
  abc(employeeForm: FormGroup) {
    if (!employeeForm.invalid) {
      console.log(employeeForm.value);
    }
  }
}
