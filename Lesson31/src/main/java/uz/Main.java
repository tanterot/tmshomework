package uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.config.AppConfig;
import uz.model.Horse;
import uz.model.User;
import uz.service.HorseService;
import uz.service.RaceService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
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