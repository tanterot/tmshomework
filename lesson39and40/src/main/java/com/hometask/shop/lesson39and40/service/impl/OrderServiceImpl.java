package com.hometask.shop.lesson39and40.service.impl;

import com.hometask.shop.lesson39and40.domain.OrderEntity;
import com.hometask.shop.lesson39and40.dto.OrderDto;
import com.hometask.shop.lesson39and40.dto.SearchDto;
import com.hometask.shop.lesson39and40.mapper.OrderMapper;
import com.hometask.shop.lesson39and40.repository.OrderRepository;
import com.hometask.shop.lesson39and40.service.OrderService;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepo;
    private final OrderMapper mapper;

    @Override
    public void createOrder(OrderDto dto) {
        orderRepo.save(mapper.toEntity(dto));
    }


    @Override
    public List<OrderDto> findAll() {
        return mapper.toDtoList(orderRepo.findAll());
    }

    @Override
    public OrderDto findById(SearchDto dto) {
        return mapper.toDto(orderRepo.findById(dto.getId()).orElse(null));
    }

    @Override
    public OrderDto findById(UUID id) {
        return mapper.toDto(orderRepo.findById(id).orElse(null));
    }

    @Transactional
    @Override
    public OrderDto update(OrderDto dto) {
        OrderEntity orderEntity = orderRepo.findById(dto.getId()).orElse(null);
        if (orderEntity != null) {
            orderEntity.setName(dto.getName());
            orderEntity.setCount(dto.getCount());
            orderEntity.setCost(dto.getCost());
            orderEntity.setIsDeleted(true);
            orderRepo.save(orderEntity);
            return mapper.toDto(orderEntity);
        }
        return null;
    }

    @Transactional
    @Override
    public OrderDto updateFieldIsDeleted(UUID id) {
        OrderEntity result = orderRepo.findById(id).orElse(null);
        if (result.getIsDeleted()) {
            result.setIsDeleted(false);
            return mapper.toDto(result);
        } else {
            result.setIsDeleted(true);
            return mapper.toDto(result);
        }
    }

    @Override
    public List<OrderDto> search(SearchDto dto) {
       return mapper.toDtoList(orderRepo.findAll(createSpecification(dto)));
    }



    private Specification<OrderEntity> createSpecification(SearchDto dto) {
        return (root, query, criteriaBuilder) -> {
            ArrayList<Predicate> predicates = new ArrayList<>();

            String name = dto.getName();
            if (name != null && !name.isEmpty()) {
                Predicate namePred = criteriaBuilder.equal(root.get("name"), name);
                predicates.add(namePred);
            }

            Integer countPr = dto.getCount();
            if (countPr != null) {
                Predicate pricePred = criteriaBuilder.lessThan(root.get("count"), countPr);
                predicates.add(pricePred);
            }


            Integer costPr = dto.getCost();
            if (costPr != null && costPr >= 0) {
                Predicate quantityPred = criteriaBuilder.greaterThan(root.get("cost"), costPr);
                predicates.add(quantityPred);
            }

            Boolean isDelivery = dto.getIsDelivery();
            if (isDelivery != null ) {
                Predicate deliveredPred = criteriaBuilder.equal(root.get("isDelivery"), isDelivery);
                predicates.add(deliveredPred);
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[]{}));
        };
    }

}