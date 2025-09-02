package exercise.model;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String name;

    public Department() {
    }

    public Department(String name) {
        System.out.println("Constructor is used to inject the department name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter is used to inject the department name");
        this.name = name;
    }

    public void init() {
        System.out.println("Department init method is called ---- Allocating resources");
    }

    public void destroy() {
        System.out.println("Department destroy method is called ---- Deallocating resources");
    }

    @Override
    public String toString() {
        return "Department : " + name;
    }
}
