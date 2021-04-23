package com.example.frontend.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.frontend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
