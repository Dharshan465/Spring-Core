package assignment12.OnlineFoodDeliveryApplication.notification;

import org.springframework.stereotype.Component;

@Component(value = "smsNotificationService")
public class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
