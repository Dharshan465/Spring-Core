package assignment12.OnlineFoodDeliveryApplication;

import assignment12.OnlineFoodDeliveryApplication.config.AppConfig;
import assignment12.OnlineFoodDeliveryApplication.order.NormalOrderService;
import assignment12.OnlineFoodDeliveryApplication.order.PrimeOrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Online Food Delivery Application!");
        System.out.println("---------------------------------------------------------");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Placing an Normal Order for 'Pizza' with amount Rs . 299");
        NormalOrderService normalOrderService = context.getBean(NormalOrderService.class);
        normalOrderService.placeOrder("Pizza", 299.0);
        System.out.println("---------------------------------------------------------");

        System.out.println("Placing an Prime Order for 'Sushi' with amount Rs . 499");
        PrimeOrderService primeOrderService = context.getBean(PrimeOrderService.class);
        primeOrderService.placeOrder("Sushi", 499.0);
        System.out.println("---------------------------------------------------------");

        context.close();


    }
}
