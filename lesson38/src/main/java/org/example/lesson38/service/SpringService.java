package org.example.lesson38.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SpringService {
    @Value("${app.login}")
    private String name;
    @Value("${app.key}")
    private String password;

    @PostConstruct
    public void test() {
        System.out.println(name);
        System.out.println(password);
    }
}
