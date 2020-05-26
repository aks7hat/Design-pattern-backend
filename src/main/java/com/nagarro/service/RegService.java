package com.nagarro.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.Model.Registration;
import com.nagarro.repository.RegRepository;

@Service
public class RegService {
	
	@Autowired
	private RegRepository repo;

	public Registration createUser(@Valid Registration registration) {
		// TODO Auto-generated method stub
		return repo.save(registration);
	}

	
	
	

}
