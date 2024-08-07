package com.hometask.shop.lesson39and40.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SearchDto {
    private UUID id;
    private String name;
    private Boolean isDelivery;
    private Integer cost;
    private Integer count;

}
