package com.jnit.NGO_Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jnit.NGO_Application.model.donation;
import com.jnit.NGO_Application.model.event;

	@Repository
	public interface donationRepository extends JpaRepository<donation, Long> {
	    // You can add custom query methods here if needed
	

	public donation save(donation newDonation);
	

	public donation findById(int donationId);

//	public void update(donation donation);
//
//	public void delete(int donationId);

	public List<donation> findAll();
	}
