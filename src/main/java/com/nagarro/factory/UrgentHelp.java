package com.nagarro.factory;

public class UrgentHelp implements BaseNotify{
	
	public UrgentHelp()
	{
		sendNotification();
	}

	@Override
	public void sendNotification() {
		System.out.println("===================================");
		System.out.println("Notification for the Urgent Help required");
		System.out.println("===================================");
		
	}
	

}
