package assignment12.OnlineFoodDeliveryApplication.order;

import assignment12.OnlineFoodDeliveryApplication.notification.NotificationService;
import assignment12.OnlineFoodDeliveryApplication.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PrimeOrderService implements OrderService{

    private final PaymentProcessor paymentProcessor;
    private final NotificationService notificationService;

    @Autowired
    public PrimeOrderService(@Qualifier(value = "upiPaymentProcessor") PaymentProcessor paymentProcessor,
                             @Qualifier(value = "smsNotificationService") NotificationService notificationService) {
        this.paymentProcessor = paymentProcessor;
        this.notificationService = notificationService;
    }

    @Override
    public void placeOrder(String item, double amount) {
        System.out.println("Prime Order placed for item: " + item + " with amount: Rs . " + amount);
        paymentProcessor.processPayment(amount);
        notificationService.sendNotification("Your prime order for " + item + " has been placed successfully!");
    }
}
