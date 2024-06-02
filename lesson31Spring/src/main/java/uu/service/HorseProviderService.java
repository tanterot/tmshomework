package uu.service;

import org.springframework.stereotype.Component;
import uu.model.Horse;


import java.util.Arrays;
import java.util.List;


@Component
public class HorseProviderService {

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