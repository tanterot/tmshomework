package com.hometask1.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Shop {
    private int number;
    private  String city;
    private  String address;
    private String phoneNumber;
}
