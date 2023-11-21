package at.htlleonding.facilitymngmt;

public abstract class Facility implements Comparable<Facility> {
    private City city;
    private String name, street;
    private int houseNumber;
    public Facility(String name, City city, String street, int houseNumber){
        this.city = city;
        this.name = name;
        this. street = street;
        this.houseNumber = houseNumber;
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
}
