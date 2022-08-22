package com.example.demo;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	static UserRepo userRepo;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println(   "hi");



	}

}
