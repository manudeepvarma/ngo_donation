package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.event;
import com.jnit.NGO_Application.model.user;

public interface eventService {
	   event createEvent(String username, String email, String password);
	    event getEventById(int eventId);
//	    void updateEvent(event event);
//	    void deleteEvent(int eventId);

	    List<event> getEvent();
}
