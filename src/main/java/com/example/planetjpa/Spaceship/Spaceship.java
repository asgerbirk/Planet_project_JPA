package com.example.planetjpa.Spaceship;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "SPACESHIP")
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME",nullable = false)
    private String name;

    @Column(name = "SIZE",nullable = false)
    private int size;

    @Column(name = "SPEED",nullable = false)
    private int speed;

}