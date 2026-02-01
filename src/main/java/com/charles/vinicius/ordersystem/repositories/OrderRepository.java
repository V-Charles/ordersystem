package com.charles.vinicius.ordersystem.repositories;

import com.charles.vinicius.ordersystem.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
