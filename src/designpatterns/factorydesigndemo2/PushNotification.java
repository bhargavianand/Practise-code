package designpatterns.factorydesigndemo2;

public class PushNotification implements Notifications{

	@Override
	public void notifyUser() {
        System.out.println("Sending Push Notification");		
	}

}
