package com.devrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
