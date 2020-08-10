package com.devrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
