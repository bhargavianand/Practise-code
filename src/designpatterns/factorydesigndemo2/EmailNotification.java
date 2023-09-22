package designpatterns.factorydesigndemo2;

public class EmailNotification implements Notifications {

	@Override
	public void notifyUser() {

		System.out.println("Sending an Email Notification");
	}

}
