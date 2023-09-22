package designpatterns.factorydesigndemo2;

public class NotificationsFactory {

	public static  Notifications createNotification(String channel) {

		if(channel==null || channel.isEmpty()) {
			return null;
		}
		switch(channel.toUpperCase()) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown channel" + channel);
		}
	}
}
