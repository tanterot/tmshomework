package com.hometask.shop.lesson39and40.repository;

import com.hometask.shop.lesson39and40.domain.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {

}
