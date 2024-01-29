import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MealCreatorComponent } from './meal-creator/meal-creator.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MealCreatorComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'MealTracker';
}
