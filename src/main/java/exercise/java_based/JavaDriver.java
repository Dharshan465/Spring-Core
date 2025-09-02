package exercise.java_based;

import exercise.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaDriver {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println(employee1);

        Employee employee2 = context.getBean("employee2",Employee.class);
        System.out.println(employee2);

        context.close();

    }

}
