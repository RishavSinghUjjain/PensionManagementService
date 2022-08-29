package com.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pension.entity.User;


public interface UserRepository extends JpaRepository<User,Long> {

}
