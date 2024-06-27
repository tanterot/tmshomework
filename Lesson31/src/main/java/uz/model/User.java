package uz.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class User {
    private final String username;
    private double balance;

    public User(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }
}