package com.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
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
