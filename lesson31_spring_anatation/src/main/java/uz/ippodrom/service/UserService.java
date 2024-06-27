package uz.ippodrom.service;

import org.springframework.stereotype.Component;
import uz.ippodrom.model.User;

@Component
public class UserService {

    public static void updateBalance(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
    }
}
