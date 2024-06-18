package com.filmlib.model;

import lombok.*;

import java.util.UUID;
@Getter @Setter
@NoArgsConstructor
public class Film {
    private UUID id;
    private String name;
    private String description;
    private Integer year;

    public Film(String name, String description, Integer year) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.year = year;
    }
}
