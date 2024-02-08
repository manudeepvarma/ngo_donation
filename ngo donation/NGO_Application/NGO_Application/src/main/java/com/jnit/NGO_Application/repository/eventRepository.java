package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.event;
import com.jnit.NGO_Application.model.user;

	@Repository
	public interface eventRepository extends JpaRepository<event, Long> {
	    // You can add custom query methods here if needed
	public event save(event newEvent);
		

	public event findById(int eventId);

//	public void update(event event);
//	
//	public void delete(int eventId);

	public List<event> findAll();

	}
