package com.ranjith.hibernateDemo.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ranjith.hibernateDemo.entity.ApplicationUser;
import com.ranjith.hibernateDemo.repository.ApplicationUserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private ApplicationUserRepository applicationUserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<ApplicationUser> applicationUser = applicationUserRepo.findById(username);

		if (applicationUser == null) {
			throw new UsernameNotFoundException(username);
		}

		log.info("UserDetails retrievd :: {}", applicationUser.get().getUsername());

		return new User(applicationUser.get().getUsername(), applicationUser.get().getPassword(),
				Collections.emptyList());
	}

}
