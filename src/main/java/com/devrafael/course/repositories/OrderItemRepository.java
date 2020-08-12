package com.devrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
