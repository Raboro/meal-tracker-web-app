package io.github.raboro.mealtrackerwebapp.logic;

import io.github.raboro.mealtrackerwebapp.database.model.Meal;
import io.github.raboro.mealtrackerwebapp.database.repository.MealRepository;
import io.github.raboro.mealtrackerwebapp.rest.dto.MealDTO;
import io.github.raboro.mealtrackerwebapp.rest.mapper.MealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Autowired
    private MealRepository repository;
    private final MealMapper mapper = new MealMapper();

    public List<MealDTO> getAll() {
        return repository.findAll().parallelStream()
                .map(mapper::toDTO)
                .toList();
    }

    public MealDTO addMeal(MealDTO dto) {
        final Meal meal = mapper.toModel(dto);
        return mapper.toDTO(repository.save(meal));
    }
}
