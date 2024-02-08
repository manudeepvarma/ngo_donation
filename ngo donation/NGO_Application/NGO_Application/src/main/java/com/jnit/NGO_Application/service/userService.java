package com.jnit.NGO_Application.service;

import java.util.List;

import com.jnit.NGO_Application.model.user;

public interface userService {
	   user createUser(String username, String email, String password);
	    user getUserById(int userId);
//	    void updateUser(user user);
//	    void deleteUser(int userId);
	    List<user> getUsers();
	    }
