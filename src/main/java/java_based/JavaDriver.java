package java_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xml_based.Student;

public class JavaDriver {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);

        System.out.println("Student 1 hashcode : " + student1.getAddress().hashCode());
        System.out.println("Student 2 hashcode : " + student2.getAddress().hashCode());

        context.close();
    }
}
