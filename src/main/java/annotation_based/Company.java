package annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private String name;
    private String city;
    
    
    public Company() {
        this.name = "Default Company";
        this.city = "Default City";
    }
    
    public Company(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Company ( Name : "+name+" City : "+city+" )";
    }
}
