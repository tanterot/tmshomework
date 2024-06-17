package com.uu.config;

import com.uu.model.User;
import com.uu.service.UserProviderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.uu")
public class AppConfig {

    @Bean
    public User user(UserProviderService userProviderService) {
        return userProviderService.createUser();
    }
}
