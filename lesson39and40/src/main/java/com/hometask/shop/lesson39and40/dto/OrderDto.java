package com.hometask.shop.lesson39and40.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private UUID id;
    private String name;
    private Integer count;
    private Integer cost;
    private Boolean isDeleted;
    private Boolean isDelivery;
}
