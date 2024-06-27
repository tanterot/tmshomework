package uz.ippodrom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import uz.ippodrom.model.Horse;
import uz.ippodrom.model.User;

import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class RaceService {
    private final User user;
    private final Random random = new Random();
    private static final int RACE_LENGTH = 3; // Три круга

    public void startRace(Horse selectedHorse, List<Horse> horses) {
        int winningHorseIndex = runRace(horses);
        Horse winningHorse = horses.get(winningHorseIndex);
        processRaceResult(selectedHorse, winningHorse);
    }

    private int runRace(List<Horse> horses) {
        int winningHorseIndex = 0;
        for (int i = 0; i < RACE_LENGTH; i++) {
            System.out.println("Race lap " + (i + 1));
            winningHorseIndex = random.nextInt(horses.size());
            System.out.println("The number horse is in the lead " + (winningHorseIndex + 1));
        }
        System.out.println("Race winner: Horse number " + (winningHorseIndex + 1));
        return winningHorseIndex;
    }

    private void processRaceResult(Horse selectedHorse, Horse winningHorse) {
        if (winningHorse.equals(selectedHorse)) {
            double winnings = 100.0 * 2;
            UserService.updateBalance(user, winnings);
            System.out.println("Congratulations! You've won " + winnings + " usd.");
        } else {
            double betAmount = 100.0;
            UserService.updateBalance(user, -betAmount);
            System.out.println("Sorry, you lost your bet..");
        }
        System.out.println("Your current balance: " + user.getBalance() + " usd");
    }
}


