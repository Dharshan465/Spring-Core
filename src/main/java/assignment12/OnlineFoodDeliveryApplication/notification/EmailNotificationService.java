package assignment12.OnlineFoodDeliveryApplication.notification;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
