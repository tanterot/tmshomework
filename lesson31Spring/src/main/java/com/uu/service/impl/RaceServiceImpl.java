package com.uu.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.uu.model.Horse;
import com.uu.model.User;
import com.uu.service.RaceService;


import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final User user;
    private UserServiceImpl userService;
    private final Random random = new Random();
    private static final int RACE_LENGTH = 3; // Три круга



    public void startRace(Horse selectedHorse, List<Horse> horses) {
        int winningHorseIndex = runRace(horses);
        Horse winningHorse = horses.get(winningHorseIndex);
        processRaceResult(selectedHorse, winningHorse);
    }

    private int runRace(List<Horse> horses) {
        System.out.println("Race laps:");
        return IntStream.range(0, RACE_LENGTH)
                .mapToObj(i -> {
                    int winningHorseIndex = random.nextInt(horses.size());
                    System.out.println("Lap " + (i + 1) + ": Horse number " + (winningHorseIndex + 1));
                    return winningHorseIndex;
                })
                .reduce((first, second) -> second)
                .orElse(0);
    }

    public void processRaceResult(Horse selectedHorse, Horse winningHorse) {
        if (winningHorse.equals(selectedHorse)) {
            double winnings = 100.0 * 2;
            userService.updateBalance(user, winnings);
            System.out.println("Congratulations! You've won " + winnings + " usd.");
        } else {
            double betAmount = 100.0;
            userService.updateBalance(user, -betAmount);
            System.out.println("Sorry, you lost your bet..");
        }
        System.out.println("Your current balance: " + user.getBalance() + " usd");
    }
}
