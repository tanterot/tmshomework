package com.filmlib.model;

import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Film {
    private UUID id;
    @Length(min = 4, max = 8, message = "incorrect name")
    private String name;
    @Size(min = 4, max = 50, message = "incorrect description")
    private String description;
    private Integer year;

    public Film(String name, String description, Integer year) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.year = year;
    }
}
