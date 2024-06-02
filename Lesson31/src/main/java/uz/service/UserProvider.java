package uz.service;

import org.springframework.stereotype.Component;
import uz.model.User;

@Component
public class UserProvider {

    public User createUser() {
        return new User("Andrei", 1000);
    }
}
