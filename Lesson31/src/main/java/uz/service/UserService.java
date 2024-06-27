package uz.service;

import org.springframework.stereotype.Component;
import uz.model.User;

@Component
public class UserService {

    public static void updateBalance(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
    }
}