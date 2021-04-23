package com.example.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frontend.model.User;
import com.example.frontend.model.dao.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
     
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/userslist")
	public java.util.List<User> listofUsers() {
		
		return  userRepo.findAll();
		
	}
}
