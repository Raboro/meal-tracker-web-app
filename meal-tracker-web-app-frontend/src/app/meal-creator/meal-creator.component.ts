import { ErrorText } from './../../types/ErrorText';
import { MealCreatorService } from './meal-creator.service';
import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-meal-creator',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './meal-creator.component.html',
  styleUrl: './meal-creator.component.css',
})
export class MealCreatorComponent {
  name = new FormControl('');
  date = new FormControl();
  errorMessage: string = '';

  constructor(service: MealCreatorService) {}

  addMeal(): void {
    this.errorMessage = '';
    if (this.name.value === '') {
      this.errorMessage = ErrorText.INVALID_NAME;
      return;
    }

    if (this.date.value == null) {
      this.errorMessage = ErrorText.INVALID_DATE;
      return;
    }
  }
}
