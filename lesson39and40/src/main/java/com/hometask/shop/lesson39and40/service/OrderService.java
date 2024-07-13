package com.hometask.shop.lesson39and40.service;

import com.hometask.shop.lesson39and40.dto.OrderDto;
import com.hometask.shop.lesson39and40.dto.SearchDto;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    void createOrder(OrderDto order);

    List<OrderDto> findAll();

    OrderDto findById(SearchDto dto);

    OrderDto findById(UUID id);

    OrderDto update(OrderDto dto);

    OrderDto updateFieldIsDeleted(UUID id);

    List<OrderDto> search(SearchDto dto);

}
