package annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "demoProduct")
@Scope("prototype")
public class Product {// default name of bean is product(small case of class name)
    private Integer id;
    private String name;
    private Double price;
    //field level injection
    //@Autowired
    private Company manufacturer;//resolution by 1.type 2.name

    public Product() {
        this.id = 0;
        this.name = "Default Product";
        this.price = 0.0;


    }

    public Product(Integer id, String name, Double price, @Autowired Company manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }
//Constructor level injection
    //@Autowired
    public Product(Company manufacturer) {
        System.out.println("Autowired using constructor called in Product");

        this.manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Company getManufacturer() {
        return manufacturer;
    }
// method setter injection
    @Autowired
    public void setManufacturer(Company manufacturer) {
        System.out.println("Autowired using setter called in Product");
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: " + price + ", Manufacturer: " + manufacturer;
    }
}
