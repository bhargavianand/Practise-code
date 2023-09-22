package designpatterns.factorydesigndemo2;

public class SMSNotification implements Notifications {

	@Override
	public void notifyUser() {

		System.out.println("Sending SMS notification");
	}

}
