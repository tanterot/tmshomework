package uz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.model.Horse;
import uz.model.User;
import uz.service.HorseProvider;
import uz.service.HorseService;
import uz.service.RaceService;
import uz.service.UserProvider;

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