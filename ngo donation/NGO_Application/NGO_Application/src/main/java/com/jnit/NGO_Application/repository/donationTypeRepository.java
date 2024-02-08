package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jnit.NGO_Application.model.donationtype;
import com.jnit.NGO_Application.model.event;

	@Repository
	public interface donationTypeRepository extends JpaRepository<donationtype, Long> {
	    // You can add custom query methods here if needed
	

	public donationtype save(donationtype newDonationType);
	
	public donationtype findById(int donationTypeId);
	

//	public void update(donationtype donationType);
//
//	public void delete(int donationTypeId);
	public List<donationtype> findAll();
	}
