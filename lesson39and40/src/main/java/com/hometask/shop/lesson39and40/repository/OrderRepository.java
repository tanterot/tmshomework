package com.hometask.shop.lesson39and40.repository;

import com.hometask.shop.lesson39and40.domain.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> , JpaSpecificationExecutor<OrderEntity> {

}
