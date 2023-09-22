package designpatterns.factorydesigndemo2;

public class TestNotificationService {
	
	public static void main(String[] args) {
		
		Notifications notification=NotificationsFactory.createNotification("EMail");
		notification.notifyUser();
	}

}
