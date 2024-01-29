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
  date = new FormControl(new Date());

  constructor(service: MealCreatorService) {}

  addMeal(): void {}
}
