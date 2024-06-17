package com.uu.service;

import com.uu.model.Horse;

import java.util.List;

public interface RaceService {
    public void startRace(Horse selectedHorse, List<Horse> horses);

}
