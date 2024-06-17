package com.uu.service.impl;

import org.springframework.stereotype.Service;
import com.uu.model.User;
import com.uu.service.UserProviderService;

@Service
public class UserProviderServiceImpl implements UserProviderService {

    public User createUser() {
        return new User("Andrei", 1000);
    }
}