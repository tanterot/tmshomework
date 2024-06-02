package uz.ippodrom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.ippodrom.model.Horse;
import uz.ippodrom.model.User;
import uz.ippodrom.service.HorseService;
import uz.ippodrom.service.RaceService;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public User user() {
        return new User("Andrei", 1000);
    }

    @Bean
    public List<Horse> horses() {
        return Arrays.asList(
                new Horse("Borka"),
                new Horse("Zorka"),
                new Horse("Zvezda"),
                new Horse("Pacer"),
                new Horse("Bublick")
        );
    }

    @Bean
    public HorseService horseService(List<Horse> horses) {
        return new HorseService(horses);
    }

    @Bean
    public RaceService raceService(User user) {
        return new RaceService(user);
    }
}
