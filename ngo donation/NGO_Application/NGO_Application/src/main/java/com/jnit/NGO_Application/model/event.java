package com.jnit.NGO_Application.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "event")
public class event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="eventName")
    private String eventName;
    @Column(name="date")
    private Date date;
    @Column(name="location")
    private String location;
    

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private user organizer;

    @OneToMany(mappedBy = "event")
    private List<donation> donations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public user getOrganizer() {
		return organizer;
	}

	public void setOrganizer(user organizer) {
		this.organizer = organizer;
	}

	public List<donation> getDonations() {
		return donations;
	}

	public void setDonations(List<donation> donations) {
		this.donations = donations;
	}
    
}