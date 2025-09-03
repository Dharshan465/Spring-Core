package assignment12.OnlineFoodDeliveryApplication.payment;

import org.springframework.stereotype.Component;

@Component(value = "upiPaymentProcessor")
public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of amount: Rs . " + amount);
    }
}
