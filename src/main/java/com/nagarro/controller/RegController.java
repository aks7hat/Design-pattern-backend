package com.nagarro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Model.Registration;
import com.nagarro.service.RegService;

@RestController
public class RegController {
	
	@Autowired
	RegService service;
	
	@PostMapping("/register")
	public Registration registerUser(@Valid @RequestBody Registration registration)
	{
		return service.createUser(registration);
		
	}
	
	

}
