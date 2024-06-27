package com.uu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Horse {
    private String name;


    public List<Horse> createHorses() {
        return Arrays.asList(
                new Horse("Borka"),
                new Horse("Zorka"),
                new Horse("Zvezda"),
                new Horse("Pacer"),
                new Horse("Bublick")
        );

    }
}


