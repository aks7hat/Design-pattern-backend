package com.nagarro.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.Model.Event;
import com.nagarro.Model.EventDescription;
import com.nagarro.Model.Registration;
import com.nagarro.Model.UserDashboard;
import com.nagarro.factory.BaseNotify;
import com.nagarro.factory.NotifyFactory;
import com.nagarro.repository.EventDescRepository;
import com.nagarro.repository.EventRepository;
import com.nagarro.repository.RegRepository;
import com.nagarro.repository.UserDashRepository;

@Service
public class NotificationService {
	@Autowired
	UserDashRepository dash;
	
//	@Autowired
//	RegRepository repo;
	@Autowired
	RegRepository repo;
	
	@Autowired
	EventRepository eve;
	
	EventDescription desc = new EventDescription();
	
	@Autowired
	EventDescRepository descrepo;
	
	NotifyFactory factory = new NotifyFactory();
	
	
	public List<UserDashboard> getSubscriber(@Valid int id) {
		
//		Optional<Registration> registration = repo.findById(id);
		
//	 List<int>event = eve.getId(id);
//			
		
		boolean celebration = eve.getCelebration(id);
		if(celebration==true)
		{
			factory.notify("celebration");
			
			desc.setDescription("Noti for celebration");
			desc.setUserId(id);
			desc.setEventType("celebration");
			desc.setEventId(id);
		
			desc.setDate("2020-05-27");
			
			
			descrepo.save(desc);
			
			
//			noti.setId(userId);
			}
		
		
		boolean holiday = eve.getholiday(id);
		if(holiday==true)
		{
			factory.notify("holiday");
			desc.setDescription("Noti for holiday");
			desc.setUserId(id);
			desc.setEventType("Holiday");
			desc.setEventId(id);
//			Date date = new Date();
			desc.setDate("2020-05-28");
			
			
			descrepo.save(desc);
		}
		
		
		boolean newPolicy = eve.getnewPolicy(id);
		if(newPolicy==true)
		{
			factory.notify("New Policy");
			desc.setDescription("Noti for new policy");
			desc.setUserId(id);
			desc.setEventType("newPolicy");
			desc.setEventId(id);
//			Date date = new Date();
			desc.setDate("2020-05-27");
			
			
			descrepo.save(desc);
		}
	
		
		boolean news = eve.getNews(id);
		if(news==true)
		{
			factory.notify("news");
			desc.setDescription("Noti for news");
			desc.setUserId(id);
			desc.setEventType("news");
			desc.setEventId(id);
//			Date date = new Date();
			desc.setDate("2020-05-28");
			
			
			descrepo.save(desc);
		}
		
		
		boolean urgentHelp = eve.getUrgentHelp(id);
		if(urgentHelp==true)
		{
			factory.notify("urgent");
			desc.setDescription("Noti for Urgent help");
			desc.setUserId(id);
			desc.setEventType("urgentHelp");
			desc.setEventId(id);
		
			desc.setDate("2020-05-27");
			
			
			descrepo.save(desc);
		}
		List<UserDashboard> event = dash.findByUserId(id);
		//System.out.println(((UserDashboard) event).getNotification());
		return event;
		
//		event.forEach(events -> events.setRegistration(null));
//		return event;
	}

}
