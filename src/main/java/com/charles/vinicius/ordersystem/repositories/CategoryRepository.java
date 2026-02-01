package com.charles.vinicius.ordersystem.repositories;

import com.charles.vinicius.ordersystem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
