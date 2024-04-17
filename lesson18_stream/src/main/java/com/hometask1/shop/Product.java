package com.hometask1.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    private String name;
    private double cost;
    private Category category;
    private boolean isDelivery;
    private Shop shop;
    private Manufacturer manufacturer;
}
