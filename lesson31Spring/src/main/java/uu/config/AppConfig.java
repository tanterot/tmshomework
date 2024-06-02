package uu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uu.model.Horse;
import uu.model.User;
import uu.service.HorseProviderService;
import uu.service.HorseService;
import uu.service.RaceService;
import uu.service.UserProviderService;

import java.util.List;

@Configuration
public class AppConfig {

    public UserProviderService userProvider() {
        return new UserProviderService();
    }

    @Bean
    public User user() {
        return userProvider().createUser();
    }

    @Bean
    public HorseProviderService horseProvider() {
        return new HorseProviderService();
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
