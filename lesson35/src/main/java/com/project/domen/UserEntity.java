package com.project.domen;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private   UUID id;
    private   String username;
    private   Integer salary;
    @Enumerated(EnumType.STRING)
    private   Role role;
}

