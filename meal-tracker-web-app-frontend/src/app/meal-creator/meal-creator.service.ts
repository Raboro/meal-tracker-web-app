import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Meal } from '../../types/Meal';
import { environment } from '../../environment/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class MealCreatorService {
  private constructor(private httpClient: HttpClient) {}

  addMeal(meal: Meal): Observable<Meal> {
    return this.httpClient.post<Meal>(`${environment.API_BASE_URL}/meal`, meal);
  }
}
