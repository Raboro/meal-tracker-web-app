package io.github.raboro.mealtrackerwebapp.rest.dto;

import java.util.Date;

public class MealDTO {

    private final long id;
    private final String name;
    private final Date date;

    public MealDTO(long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
