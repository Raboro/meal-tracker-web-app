package io.github.raboro.mealtrackerwebapp.database.repository;

import io.github.raboro.mealtrackerwebapp.database.model.Meal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = "io.github.raboro.mealtrackerwebapp.logic")
public interface MealRepository extends JpaRepository<Meal, Long> {
}
