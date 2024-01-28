package io.github.raboro.mealtrackerwebapp.rest.dto;

import java.util.Date;

public class MealDTO {

    private final String name;
    private final Date date;

    public MealDTO(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
