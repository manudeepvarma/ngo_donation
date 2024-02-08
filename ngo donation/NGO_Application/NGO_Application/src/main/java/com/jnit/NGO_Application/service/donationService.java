package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.donation;
import com.jnit.NGO_Application.model.event;

public interface donationService {
	   donation createDonation(String username, String email, String password);
	   donation getDonationById(int donationId);
//	    void updateDonation(donation donation);
//	    void deleteDonation(int donationId);

       List<donation> getdonation();
}
