package com.project.config;

import com.project.domen.OrderEntity;
import com.project.domen.PersonEntity;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;


@Configuration
@ComponentScan(basePackages = "com.project")
public class AppConfig {

    @Bean
    public SessionFactory sessionFactory() {

        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        Properties properties = new Properties();
        properties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/persons");
        properties.put("hibernate.connection.username", "postgres");
        properties.put("hibernate.connection.password", "postgres");
        properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.put("hibernate.show_sql", true);
        properties.put("hibernate.hbm2ddl.auto", "create");
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(PersonEntity.class);
        configuration.addAnnotatedClass(OrderEntity.class);

        return configuration.buildSessionFactory();

    }
}
