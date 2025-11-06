package com.example.canspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.canspring.model.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
