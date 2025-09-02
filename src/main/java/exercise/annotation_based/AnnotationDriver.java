package exercise.annotation_based;

import exercise.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDriver {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeApplicationConfig.class);

        Employee employee1 = context.getBean("employeeDemo", Employee.class);
        System.out.println(employee1);
        System.out.println(employee1.hashCode());
    }
}
