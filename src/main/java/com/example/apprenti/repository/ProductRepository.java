package com.example.apprenti.repository;

import com.example.apprenti.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Optional<Product> findByLabel(String label);

    Optional<Product> findById(String id);

    Optional<Product> findByDescription(String description);
}
