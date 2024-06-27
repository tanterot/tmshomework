package com.uu.service.impl;

import com.uu.model.Horse;
import com.uu.model.User;
import com.uu.service.GameService;
import com.uu.service.RaceService;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class GameServiceImpl implements GameService {

    public User user;
    public HorseServiceImpl horseService;
    public RaceService raceService;


    @Override
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (user.getBalance() > 0) {
            horseService.displayHorses();
            System.out.println("Enter horse number:");
            int horseNumber = scanner.nextInt();
            if (horseNumber < 1 || horseNumber > horseService.getHorses().size()) {
                System.out.println("Invalid horse number. Please try again.");
                continue;
            }
            Horse selectedHorse = horseService.getHorse(horseNumber);
            raceService.startRace(selectedHorse, horseService.getHorses());
        }

        System.out.println("End game");
    }

}
