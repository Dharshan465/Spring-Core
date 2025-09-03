# Spring Core IoC & DI Assignment 12 : Online Food Delivery Application

This project demonstrates the core concepts of Spring Framework's Inversion of Control (IoC) and Dependency Injection (DI) using annotation-based configuration within a simulated Online Food Delivery Platform.

## Key Concepts Demonstrated:
*   **IoC and DI:** Achieved through Spring's container managing object creation and dependency provision.
*   **Annotation-Based Configuration:** Extensive use of `@Component`, `@Service`, `@Autowired`, `@Qualifier`, `@Configuration`, and `@ComponentScan`.
*   **Loose Coupling:** Demonstrated by easily switching implementations (e.g., `NormalOrderService` vs. `PrimeOrderService` injecting different payment/notification types).
*   **Layered Architecture:** Clear separation of concerns with `order`, `payment`, and `notification` modules.

## Implementation Highlights:

1.  **Service Interfaces & Implementations:**
    *   `OrderService` with `NormalOrderService` and `PrimeOrderService`.
    *   `PaymentProcessor` with `CardPaymentProcessor` and `UPIPaymentProcessor`.
    *   `NotificationService` with `EmailNotificationService` and `SMSNotificationService`.

2.  **Dependency Injection:**
    *   `@Autowired` used primarily for constructor injection across services (e.g., `NormalOrderService` injecting `PaymentProcessor` and `NotificationService`).
    *   `@Qualifier` used to specify which concrete implementation of an interface should be injected (e.g., `NormalOrderService` uses `CardPaymentProcessor` and `EmailNotificationService`, while `PrimeOrderService` uses `UPIPaymentProcessor` and `SMSNotificationService`).

3.  **Spring Configuration:**
    *   `AppConfig.java` class annotated with `@Configuration` and `@ComponentScan` to enable component scanning for all service, component, and configuration classes.

4.  **Application Execution (`MainApp`):**
    *   Initializes the Spring container using `AnnotationConfigApplicationContext`.
    *   Retrieves specific `OrderService` beans (`normalOrderService`, `primeOrderService`) from the context.
    *   Simulates placing orders to demonstrate how the injected dependencies (payment and notification types) vary based on the `OrderService` implementation.

## Project Structure:

assignment12/
    └── OnlineFoodDeliveryApplication/
                       ├── config/
                       │   └── AppConfig.java
                       ├── order/
                       │   ├── NormalOrderService.java
                       │   ├── OrderService.java
                       │   └── PrimeOrderService.java
                       ├── payment/
                       │   ├── CardPaymentProcessor.java
                       │   ├── PaymentProcessor.java
                       │   └── UPIPaymentProcessor.java
                       ├── notification/
                       │   ├── EmailNotificationService.java
                       │   ├── NotificationService.java
                       │   └── SMSNotificationService.java
                       └── MainApp.java
                       └── assignment12.md

