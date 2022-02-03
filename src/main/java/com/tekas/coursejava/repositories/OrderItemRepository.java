package com.tekas.coursejava.repositories;

import com.tekas.coursejava.entities.OrderItem;
import com.tekas.coursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
