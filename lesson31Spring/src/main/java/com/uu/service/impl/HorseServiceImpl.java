package com.uu.service.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.uu.aspect.Benchmark;
import com.uu.model.Horse;
import com.uu.service.HorseService;

import java.util.List;
import java.util.stream.IntStream;

@Service
@Getter
@RequiredArgsConstructor
public class HorseServiceImpl implements HorseService {


    private final List<Horse> horses;
@Benchmark
    public void displayHorses() {
        System.out.println("List of horses:");
        IntStream.range(0, horses.size())
                .forEach(i -> System.out.println((i + 1) + ". " + horses.get(i).getName()));

    }


    public Horse getHorse(int horseNum) {
        return horses.get(horseNum - 1);
    }
}
