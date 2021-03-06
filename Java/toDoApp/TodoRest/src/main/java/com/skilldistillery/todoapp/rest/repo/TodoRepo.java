package com.skilldistillery.todoapp.rest.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.entities.User;

public interface TodoRepo extends JpaRepository<Todo, Integer> {

	public Set<Todo> findByUser(User user);
	public Todo findByUserAndId(User user, int id);

}
