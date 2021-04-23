package com.example.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.frontend.model.User;
import com.example.frontend.model.dao.UserRepository;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		userRepo.save(new User("Kratika","Ahire","kratika.ahire01@gmail.com"));
		userRepo.save(new User("Tanmay","Patil","tanmay.patil@gmail.com"));
		userRepo.save(new User("Pranay","Ahire","pranay.ahire@gmail.com"));
		userRepo.save(new User("Nivedita","Patil","nivedita.patil@gmail.com"));
		
		
	}

}
