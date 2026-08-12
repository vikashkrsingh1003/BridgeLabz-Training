package com.demogreetingsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demogreetingsapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    User findByUsernameAndPassword(
            String username,
            String password
    );
}