package com.example.canspring.entity;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    // Database Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @OneToMany(mappedBy = "category")
    private List<Snippet> snippets;

    @Column(nullable = false, unique = true)
    private String name;

    // Constructors
    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    // Setters and Getters

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}