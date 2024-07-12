package com.hometask.shop.lesson39and40.mapper;

import com.hometask.shop.lesson39and40.domain.OrderEntity;
import com.hometask.shop.lesson39and40.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "cost", constant = "0")
    @Mapping(target = "isDeleted", constant = "false")
    OrderEntity toEntity(OrderDto dto);

    OrderDto toDto(OrderEntity entity);

    List<OrderDto> toDtoList(List<OrderEntity> entityList);

}
