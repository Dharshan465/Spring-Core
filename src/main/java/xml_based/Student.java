package xml_based;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private int id;
    private String name;
    private Address address;
    public Student() {
    }

    public Student(int id, String name, Address address) {
        System.out.println("Constructor is used to inject the address");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter is used to inject the address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student ID : "+ id + " Name : "+name + address+"\n";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean method is called ---- Allocating resources");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean method is called ---- Deallocating resources");
    }
}
