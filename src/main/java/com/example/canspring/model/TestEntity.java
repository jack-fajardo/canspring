package com.example.canspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // tells Hibernate this class maps to a database table
@Table(name = "jack") // specify table name
public class TestEntity {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment ID
    private Long id;

    private String name;

    // constructor
    public TestEntity() {
    }

    public TestEntity(String name) {
        this.name = name;
    }

    // getters and setters (required for JPA)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
