package com.tekas.coursejava.repositories;

import com.tekas.coursejava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
