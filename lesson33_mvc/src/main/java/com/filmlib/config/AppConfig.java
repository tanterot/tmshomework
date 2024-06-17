package com.filmlib.config;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@ComponentScan(basePackages = "com.filmlib")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
