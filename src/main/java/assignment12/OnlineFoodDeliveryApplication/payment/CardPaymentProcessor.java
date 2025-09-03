package assignment12.OnlineFoodDeliveryApplication.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing card payment of amount: Rs . " + amount);
    }
}
