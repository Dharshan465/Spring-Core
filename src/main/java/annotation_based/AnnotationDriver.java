package annotation_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDriver {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Product product=context.getBean(Product.class);

        System.out.println(product);

        Product product1=context.getBean("demoProduct",Product.class);
        System.out.println(product1);
        System.out.println(product.hashCode());
        System.out.println(product1.hashCode());
    }
}
