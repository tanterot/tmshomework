package uu.service;

import org.springframework.stereotype.Component;
import uu.model.User;

@Component
public class UserService {

    public static void updateBalance(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
    }
}
