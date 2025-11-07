// note: This repository layer is also almost noilerplate code... We just need our own 
//       repository class that extends JPA so we would have its CRUD methods
package com.example.canspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.canspring.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
