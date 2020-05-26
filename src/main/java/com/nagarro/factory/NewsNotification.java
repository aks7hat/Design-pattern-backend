package com.nagarro.factory;

public class NewsNotification implements BaseNotify{
	
	public NewsNotification()
	{
		sendNotification();
	}
	@Override
	public void sendNotification() {
		System.out.println("===================================");
		System.out.println("This is the notification for the News");
		System.out.println("===================================");
		
	}

}
