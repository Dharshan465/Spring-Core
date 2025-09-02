package java_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xml_based.Address;
import xml_based.Student;

@Configuration
public class BeansConfig {
    @Bean
    public Address address1() {
        return new Address(101, "Chennai");
    }
    @Bean
    public Address address2() {
        return new Address(102, "Bangalore");
    }
//    @Bean
//    public Student student1(Address address1) {
//        return new Student(1, "Dharshan",address1);
//    }

    @Bean
    public Student student1() {
        return new Student(1, "Dharshan", address1());
    }
    @Bean
    public Student student2() {
        return new Student(2, "Kumar", address2());
    }
}
