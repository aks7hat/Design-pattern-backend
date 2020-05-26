package com.nagarro.service;

import javax.management.relation.RelationNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.Model.Event;


import com.nagarro.repository.EventRepository;
import com.nagarro.repository.RegRepository;


@Service
public class EventService {
	
	@Autowired
	RegRepository repo;
	
	@Autowired
	EventRepository eve;

	public Event saveEvent(int id, @Valid Event events) throws RelationNotFoundException {
		return repo.findById(id).map(user -> {
			events.setRegistration(user);
			Event event = eve.save(events);
			event.setRegistration(null);
			return event;
		}).orElseThrow(() -> new RelationNotFoundException());
		
	
	}

}
