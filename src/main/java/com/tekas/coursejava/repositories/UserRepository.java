package com.tekas.coursejava.repositories;

import com.tekas.coursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
