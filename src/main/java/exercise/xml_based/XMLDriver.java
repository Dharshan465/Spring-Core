package exercise.xml_based;

import exercise.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLDriver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);

        context.close();

    }

}
