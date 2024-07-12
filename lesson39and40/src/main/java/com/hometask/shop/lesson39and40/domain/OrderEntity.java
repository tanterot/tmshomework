package com.hometask.shop.lesson39and40.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private Integer count;
    private Integer cost;
    @Column(name = "is_deleted")
    private Boolean isDeleted;

}
