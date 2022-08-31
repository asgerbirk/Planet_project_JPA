package com.example.planetjpa.Spaceship.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
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


    public Spaceship(String name, int size, int speed) {
        this.name = name;
        this.size = size;
        this.speed = speed;
    }
}
