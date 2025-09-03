package assignment12.OnlineFoodDeliveryApplication.order;

import assignment12.OnlineFoodDeliveryApplication.notification.NotificationService;
import assignment12.OnlineFoodDeliveryApplication.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class NormalOrderService implements OrderService {

    private final PaymentProcessor paymentProcessor;
    private final NotificationService notificationService;

    @Autowired
    public NormalOrderService(@Qualifier(value = "cardPaymentProcessor") PaymentProcessor paymentProcessor,
                              @Qualifier(value = "emailNotificationService") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Normal Order placed for item: " + item + " with amount: Rs . " + amount);
        paymentProcessor.processPayment(amount);
        notificationService.sendNotification("Your order for " + item + " has been placed successfully!");
    }
}
