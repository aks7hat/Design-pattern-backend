package com.nagarro.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.nagarro.Model.UserDashboard;
import com.nagarro.repository.EventDescRepository;
import com.nagarro.repository.UserDashRepository;

@Service
public class SchedulerService {
	
	@Autowired
	UserDashRepository dash;
	
	@Autowired
	EventDescRepository eve;
//	int Id;
//	public void getDetails(int id)
//	{
//		this.Id = id;
//		schedule();
//		
//	
//	}
	@Scheduled(cron="0 0 12 * * ?")
	public void schedule()
	{
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		String currentDate=dtf.format(now);
		List<String> description = eve.getDescription(currentDate);
		List<String> eventType = eve.geteventType(currentDate);
		List<Integer> userId = eve.getUserId(currentDate);
		
		UserDashboard user = new UserDashboard();
		for(String i:description)
		{ 
			user.setNotification(i);
			
		}
		for(String i:eventType)
		{ 
			user.setEventType(i);
			
		}
		for(int i:userId)
		{ 
			user.setUserId(i);
			
		}
		
//		user.setEventType(eventType);
//		user.setNotification(description);
		dash.save(user);
		
	}
	
	

}
