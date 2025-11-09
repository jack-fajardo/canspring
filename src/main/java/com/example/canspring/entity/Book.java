// NOTE:
// My entity defines the database table structure handled by Hibernate.
// JSON from clients goes into a DTO first, then we copy the DTO fields here
// to safely save them in the database (that is why it has @setters).
package com.example.canspring.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String description;
    private String file_name;
    private String file_url;
    private String file_size;
    private String content_type;

    @CreationTimestamp
    @Column(name = "upload_date")
    private LocalDateTime uploadDate;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // constructor
    public Book() {
    }
}
