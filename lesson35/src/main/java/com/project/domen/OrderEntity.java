package com.project.domen;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "ordeps")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Version
    @Column(name = "version_order")
    private Integer version;
    @CreationTimestamp
    @Column(name = "data_create_order")
    private Date creationDate;
    @UpdateTimestamp
    @Column(name = "data_update_order")
    private Date updateDate;

    private String description;


    @ManyToOne
    @JoinColumn(name = "person_id")
    @ToString.Exclude
    private PersonEntity person;
}