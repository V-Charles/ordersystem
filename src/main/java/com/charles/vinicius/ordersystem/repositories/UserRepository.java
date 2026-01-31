package com.charles.vinicius.ordersystem.repositories;

import com.charles.vinicius.ordersystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
