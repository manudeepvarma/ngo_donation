package com.jnit.NGO_Application.model;

import java.util.Date;

import jakarta.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "donation")
public class donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="amount")
    private Double amount;
    @Column(name="date")
    private Date date;
    
    @ManyToOne
    @JoinColumn(name = "donor_id")
    private user donor;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private event event;

    @ManyToOne
    @JoinColumn(name = "donation_type_id")
    private donationtype donationType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public user getDonor() {
		return donor;
	}

	public void setDonor(user donor) {
		this.donor = donor;
	}

	public event getEvent() {
		return event;
	}

	public void setEvent(event event) {
		this.event = event;
	}

	public donationtype getDonationType() {
		return donationType;
	}

	public void setDonationType(donationtype donationType) {
		this.donationType = donationType;
	}
    

}