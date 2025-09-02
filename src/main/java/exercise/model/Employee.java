package exercise.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(
        value = "employeeDemo")
@Scope("prototype")
public class Employee {
    private String name;
    private int id;
    //field level injection
    @Autowired
    private Department department;


    public Employee() {

    }
    //@Autowired
    public Employee(Department department) {
        System.out.println("Autowired using constructor called in Employee");
        this.department = department;
    }

    public Employee(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    public void setDepartment(Department department) {
        System.out.println("Autowired Setter is used to inject the department");
        this.department = department;
    }

    public void init() {
        System.out.println("init method is called ---- Allocating resources");
    }

    public void destroy() {
        System.out.println("destroy method is called ---- Deallocating resources");
    }

    @Override
    public String toString() {
        return "Employee ID : " + id + " Name : " + name + ", Department : " + department + "\n";
    }

}
