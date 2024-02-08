package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.user;
@Repository
	public interface userRepository extends JpaRepository<user, Long> {
	    // You can add custom query methods here if needed
//	public void update(user user);

	public user findById(int userId);

//	public void delete(int userId);

	public user save(user newUser);
	
	public List<user> findAll();

	}

