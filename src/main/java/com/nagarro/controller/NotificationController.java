package com.nagarro.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Model.Event;
import com.nagarro.Model.UserDashboard;
import com.nagarro.service.NotificationService;
import com.nagarro.service.SchedulerService;

@RestController
public class NotificationController {
	
	@Autowired
	NotificationService service;
	
	@Autowired
	SchedulerService schedule;
	
	@GetMapping("/user/{userId}/event")
	public List<UserDashboard> getUser(@PathVariable(value = "userId") int Id)
	{
		
		
		//schedule.getDetails(Id);
		
		return service.getSubscriber(Id);
		
	}
	
}
