package com.uu.service.impl;

import org.springframework.stereotype.Service;
import com.uu.model.Horse;
import com.uu.service.HorseProviderService;


import java.util.Arrays;
import java.util.List;


@Service
public class HorseProviderServiceImpl implements HorseProviderService {

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