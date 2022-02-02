package com.tekas.coursejava.repositories;

import com.tekas.coursejava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
