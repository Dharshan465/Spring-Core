package xml_based;

public class Address {
    private int doorNo;
    private String city;

    public Address(){

    }

    public Address(int doorNo, String city) {
        this.doorNo = doorNo;
        this.city = city;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return " , Address : Door No : "+doorNo+", City : "+city;
    }
}
