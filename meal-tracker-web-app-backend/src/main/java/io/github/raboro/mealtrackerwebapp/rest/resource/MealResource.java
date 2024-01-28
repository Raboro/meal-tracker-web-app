package io.github.raboro.mealtrackerwebapp.rest.resource;

import io.github.raboro.mealtrackerwebapp.logic.MealService;
import io.github.raboro.mealtrackerwebapp.rest.dto.MealDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Path("/meal")
public class MealResource {

    @Autowired
    private MealService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MealDTO> getAll() {
        return service.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MealDTO addMeal(@RequestBody MealDTO dto) {
        return service.addMeal(dto);
    }


}
