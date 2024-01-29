package io.github.raboro.mealtrackerwebapp.rest.mapper;

import io.github.raboro.mealtrackerwebapp.database.model.Meal;
import io.github.raboro.mealtrackerwebapp.rest.dto.MealDTO;

public class MealMapper {

    public MealDTO toDTO(Meal meal) {
        return new MealDTO(meal.getId(), meal.getName(), meal.getDate());
    }

    public Meal toModel(MealDTO dto) {
        return new Meal(dto.getName(), dto.getDate());
    }
}
