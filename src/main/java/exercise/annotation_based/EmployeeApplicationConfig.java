package exercise.annotation_based;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "exercise")
public class EmployeeApplicationConfig {

}
