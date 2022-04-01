package com.sammburu.categoryservice.repository;

import com.sammburu.categoryservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByCategory(String category);
}
