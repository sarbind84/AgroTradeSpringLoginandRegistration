package com.advatix.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.advatix.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Database query created by method name findByEmail
    User findByEmail(String email);
}
