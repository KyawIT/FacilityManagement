package at.htlleonding.facilitymngmt;

import java.util.Objects;

public class City implements Comparable<City> {
    private int postalCode;
    private String city;

    public City(int postalCode, String city) {
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getZipCode() {
        return postalCode;
    }

    public String getName() {
        return city;
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(postalCode, o.getZipCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return postalCode == city1.postalCode;
    }

    @Override
    public String toString() {
        return postalCode + " " + city;
    }
}
