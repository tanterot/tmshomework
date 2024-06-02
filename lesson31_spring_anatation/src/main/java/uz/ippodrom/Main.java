package uz.ippodrom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.ippodrom.config.AppConfig;
import uz.ippodrom.model.Horse;
import uz.ippodrom.model.User;
import uz.ippodrom.service.HorseService;
import uz.ippodrom.service.RaceService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HorseService horseService = context.getBean(HorseService.class);
        RaceService raceService = context.getBean(RaceService.class);
        User user = context.getBean(User.class);

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

