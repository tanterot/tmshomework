package com.uu.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.uu.model.User;
import com.uu.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    public final User user;

    public void updateBalance(User user, double amount) {
        user.setBalance(user.getBalance() + amount);
    }
}
