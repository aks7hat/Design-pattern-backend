package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.Model.AuthRequest;
import com.nagarro.Model.EventDescription;
import com.nagarro.Model.Registration;
import com.nagarro.factory.CelebrationNotify;
import com.nagarro.factory.NotifyFactory;
import com.nagarro.repository.EventDescRepository;
import com.nagarro.repository.EventRepository;
import com.nagarro.repository.RegRepository;


@Service
public class LoginService {
	
	@Autowired
	RegRepository repo;
	
	@Autowired
	EventRepository eve;
	
	EventDescription desc;
	
	@Autowired
	EventDescRepository descrepo;
	
	NotifyFactory factory = new NotifyFactory();
	
	
//	CelebrationNotify noti = new CelebrationNotify();
	
	public int authenticate(AuthRequest auth) {
		String email = auth.getEmail();
		int userId = repo.getuserId(email);
	
		
//		boolean celebration = eve.getCelebration(userId);
//		if(celebration==true)
//		{
//			factory.notify("celebration");
////			noti.setId(userId);
//		}
//		
//		
//		boolean holiday = eve.getholiday(userId);
//		if(holiday==true)
//		{
//			factory.notify("holiday");
//		}
//		
//		
//		boolean newPolicy = eve.getnewPolicy(userId);
//		if(newPolicy==true)
//		{
//			factory.notify("New Policy");
//		}
//	
//		
//		boolean news = eve.getNews(userId);
//		if(news==true)
//		{
//			factory.notify("news");
//		}
//		
//		
//		boolean urgentHelp = eve.getUrgentHelp(userId);
//		if(urgentHelp==true)
//		{
//			factory.notify("urgent");
//		}
		
		
		Registration login = repo.findByEmail(email);
		
		
		if(login.getPassword().equals(auth.getPassword())) {
			
			return userId;
		    } 
		
		else {
			return -1;
		}
		
		
	}

}
