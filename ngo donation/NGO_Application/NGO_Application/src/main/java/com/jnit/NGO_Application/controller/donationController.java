
package com.jnit.NGO_Application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.NGO_Application.model.donation;
import com.jnit.NGO_Application.model.user;
import com.jnit.NGO_Application.repository.donationRepository;

import com.jnit.NGO_Application.service.donationService;

@RestController
public class donationController implements donationService {
 private donationRepository donationRepository;

 public donationController(donationRepository donationRepository) {
     this.donationRepository = donationRepository;
 }

 public donation createDonation(String username, String email, String password) {
     donation newDonation = new donation();
     return donationRepository.save(newDonation);
 }

 public donation getDonationById(int donationId) {
     return donationRepository.findById(donationId);
 }
 @GetMapping("/donations")
 public List<donation> getdonation() {
 	return donationRepository.findAll();
 	
 	
 	
 }

// public void updateDonation(donation donation) {
//     donationRepository.update(donation);
// }
//
// public void deleteDonation(int donationId) {
//     donationRepository.delete(donationId);
// }

 }
