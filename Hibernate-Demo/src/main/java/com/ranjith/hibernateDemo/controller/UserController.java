package com.ranjith.hibernateDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjith.hibernateDemo.entity.ApplicationUser;
import com.ranjith.hibernateDemo.repository.ApplicationUserRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
public class UserController {

	@Autowired
	private ApplicationUserRepository applicationUserRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping("/sign-up")
	public void signUp(@RequestBody ApplicationUser user) {
//		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		log.info(user.toString());
		applicationUserRepository.save(user);
	}
	

	@GetMapping("/hello")
	public String hello(@RequestBody ApplicationUser user) {
		log.info("");
		
		return "Helloworld";
	}

}
