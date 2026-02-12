package com.mockito;

public class UserNotify {
	private NotificationService ns;
	
	public UserNotify(NotificationService ns) {
		this.ns= ns;
	}
	public void registerUser(String username) {
		//business logic
		ns.sendNotification("Welcome "+ username);
	}

}
