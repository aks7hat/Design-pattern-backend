package com.nagarro.factory;

public class NotifyFactory {
	
	NotifyFactory noti = null;
	public BaseNotify notify(String type)
	{
		
		if(type==null)
		{
		return null;
		}
		else if(type.equalsIgnoreCase("urgent"))
		{
			return new UrgentHelp();
			
		}
		else if(type.equalsIgnoreCase("celebration"))
		{
			return new CelebrationNotify();
			
		}
		else if(type.equalsIgnoreCase("New Policy"))
		{
			return new NewPolicyNoti();
			
		}else if(type.equalsIgnoreCase("news"))
		{
			return new NewsNotification();
			
		}else if(type.equalsIgnoreCase("holiday"))
		{
			return new HolidayNotify();
			
		}
		return null;
		
	}

}
