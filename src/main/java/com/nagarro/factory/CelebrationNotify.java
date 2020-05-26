package com.nagarro.factory;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.Model.EventDescription;
import com.nagarro.repository.EventDescRepository;

public class CelebrationNotify implements BaseNotify {
	
	@Autowired
	EventDescription desc;
	
	@Autowired
	EventDescRepository descrepo;
	
	public CelebrationNotify()
	{
		sendNotification();
	}
	int id;
	@Override
	public void sendNotification() {
		System.out.println("===================================");
		System.out.println("This is the notification for the celebration");
		System.out.println("===================================");
 
	}



}
