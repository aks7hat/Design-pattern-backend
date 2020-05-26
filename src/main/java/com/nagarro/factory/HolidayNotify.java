package com.nagarro.factory;

public class HolidayNotify implements BaseNotify{
	
	public HolidayNotify()
	{
		sendNotification();
	}
	

	@Override
	public void sendNotification() {
		System.out.println("===================================");
		System.out.println("This is the notification for Holiday");
		System.out.println("===================================");
		
	}

}
