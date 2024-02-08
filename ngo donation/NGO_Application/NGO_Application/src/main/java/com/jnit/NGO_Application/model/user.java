package com.jnit.NGO_Application.model;

import java.util.List;

import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
@Entity
@Table(name = "users")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="firstName")
    private String first_name;
    @Column(name="lastName")
    private String last_name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="role")
    private String role;

    @OneToMany(mappedBy = "organizer")
    private List<event> organizedEvents;

    @OneToMany(mappedBy = "donor")
    private List<donation> donations;
    // Getters and setters


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<event> getOrganizedEvents() {
		return organizedEvents;
	}

	public void setOrganizedEvents(List<event> organizedEvents) {
		this.organizedEvents = organizedEvents;
	}

	public List<donation> getDonations() {
		return donations;
	}

	public void setDonations(List<donation> donations) {
		this.donations = donations;
	}

}




