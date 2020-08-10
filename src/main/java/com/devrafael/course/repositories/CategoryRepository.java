package com.devrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
