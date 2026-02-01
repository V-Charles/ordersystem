package com.charles.vinicius.ordersystem.repositories;

import com.charles.vinicius.ordersystem.entities.Category;
import com.charles.vinicius.ordersystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
