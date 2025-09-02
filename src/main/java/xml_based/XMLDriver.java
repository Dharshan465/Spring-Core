package xml_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLDriver {


    public static void main(String[] args) {
        //Without Spring creating object
        Student student = new Student(1, "Dharshan", new Address(101, "Chennai"));
        System.out.println(student);
        System.out.println("----------------------------------");
        //with Spring creating object using XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);

        Student student3 = (Student) context.getBean("student2");
        System.out.println(student3);

        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());


        Student student4 = (Student) context.getBean("student4");
        System.out.println(student4);


    }

}
