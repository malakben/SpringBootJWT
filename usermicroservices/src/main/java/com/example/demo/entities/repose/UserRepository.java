package com.example.demo.entities.repose;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

User findByUsername(String username);

}
