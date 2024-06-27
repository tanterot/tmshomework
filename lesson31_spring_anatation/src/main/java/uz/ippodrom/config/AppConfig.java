package uz.ippodrom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.ippodrom.model.Horse;
import uz.ippodrom.model.User;
import uz.ippodrom.service.HorseProvider;
import uz.ippodrom.service.HorseService;
import uz.ippodrom.service.RaceService;
import uz.ippodrom.service.UserProvider;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    public UserProvider userProvider() {
        return new UserProvider();
    }

    @Bean
    public User user() {
        return userProvider().createUser();
    }

    @Bean
    public HorseProvider horseProvider() {
        return new HorseProvider();
    }

    @Bean
    public List<Horse> horses() {
        return horseProvider().createHorses();
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
