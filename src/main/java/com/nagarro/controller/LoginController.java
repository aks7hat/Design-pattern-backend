package com.nagarro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Model.AuthRequest;
import com.nagarro.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@PostMapping("/login")
	public int login(@Valid @RequestBody AuthRequest auth) {
		
		return service.authenticate(auth);
		
		
	}

}
