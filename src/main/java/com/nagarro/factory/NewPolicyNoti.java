package com.nagarro.factory;

public class NewPolicyNoti implements BaseNotify{
	
	public NewPolicyNoti()
	{
		sendNotification();
	}

	@Override
	public void sendNotification() {
		System.out.println("===================================");
		System.out.println("Notification regarding the New Policies");
		System.out.println("===================================");
		
	}

}
