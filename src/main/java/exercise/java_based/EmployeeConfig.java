package exercise.java_based;

import exercise.model.Department;
import exercise.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class EmployeeConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Department department() {
        return new Department("IT");
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Employee employee1() {
        return new Employee(1, "Dharshan", department());
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Employee employee2() {
        return new Employee(2, "Kumar", department());
    }

}
