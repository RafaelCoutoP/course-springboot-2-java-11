package com.devrafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrafael.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
