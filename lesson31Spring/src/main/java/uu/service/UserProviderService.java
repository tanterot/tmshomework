package uu.service;

import org.springframework.stereotype.Component;
import uu.model.User;

@Component
public class UserProviderService {

    public User createUser() {
        return new User("Andrei", 1000);
    }
}