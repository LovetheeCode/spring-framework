package com.cydeo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    //we are doing ORM - table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //--> it is primary key, and to define it use annotation @Id
    private String name;

}
