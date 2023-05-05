package com.gustavo.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Animal {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
}
