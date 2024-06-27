package uz.ippodrom.service;

import org.springframework.stereotype.Component;
import uz.ippodrom.model.User;

@Component
public class UserProvider {

    public User createUser() {
        return new User("Andrei", 1000);
    }
}