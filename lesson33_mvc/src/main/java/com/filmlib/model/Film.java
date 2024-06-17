package com.filmlib.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data @NoArgsConstructor @AllArgsConstructor
public class Film {
    private UUID id;
    private String name;
    private String description;
    private Integer year;
    private boolean isViewed;

    public Film(String name, String description, Integer year, boolean isViewed) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.year = year;
        this.isViewed = isViewed;
    }
    public boolean getIsViewed() {
        return this.isViewed;
    }
}