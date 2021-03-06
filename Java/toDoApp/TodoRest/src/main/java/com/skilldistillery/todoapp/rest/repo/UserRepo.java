package com.skilldistillery.todoapp.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.todoapp.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByUsername(String username);

}
