package com.hometask.shop.lesson42.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;


import java.util.Date;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "pupils")
public class PupilEntity {
    @Id
    @UuidGenerator
    private UUID id;

    private String name;
    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "class_number")
    private Integer classNum;

    private String address;
}