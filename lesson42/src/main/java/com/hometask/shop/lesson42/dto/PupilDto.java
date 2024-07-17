package com.hometask.shop.lesson42.dto;

import com.hometask.shop.lesson42.domain.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PupilDto {

    private UUID id;
    private String name;
    private String lastName;
    private Sex sex;
    private Date birthDate;
    private String address;
    private Integer classNum;
}
