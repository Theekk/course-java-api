package com.tekas.coursejava.repositories;

import com.tekas.coursejava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
