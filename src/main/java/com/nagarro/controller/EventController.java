package com.nagarro.controller;

import javax.management.relation.RelationNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.Model.Event;
import com.nagarro.service.EventService;



@RestController
public class EventController {
	
	@Autowired
	EventService service;
	
	@PostMapping("/user/{userId}/event")
	public Event setEvent(@PathVariable(value = "userId") int Id , @Valid @RequestBody Event events) throws RelationNotFoundException
	{
		return service.saveEvent(Id , events) ;
		
	}
}

