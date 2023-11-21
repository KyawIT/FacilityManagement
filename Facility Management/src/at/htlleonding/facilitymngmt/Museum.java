package at.htlleonding.facilitymngmt;

import jdk.jshell.spi.ExecutionControl;

import java.util.*;

public class Museum extends Facility{
    private List<String> collectionFoci = new ArrayList<>();
    public Museum(String name, City city, String street, int houseNumber) {
        super(name, city, street, houseNumber);
    }

    public boolean hasCollectionFocus(String foci) {
        return collectionFoci.contains(foci);
    }

    @Override
    public int compareTo(Facility o) {
        return 0;
    }

    public boolean addCollectionFocus(String foci) {
        if (hasCollectionFocus(foci))
            return false;
        return collectionFoci.add(foci);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Museum museum = (Museum) obj;
        return this.getCity().equals(museum.getCity());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(getName()).append(" (").append(getStreet() + " " + getHouseNumber()).append(", ").append(getCity().toString()).append(") - Sammlungsschwerpunkte: ");
        if (collectionFoci.isEmpty()) {
            result.append("Keine Sammlungsschwerpunkte");
        } else {
            result.append(String.join(", ", collectionFoci));
        }

        return result.toString();

    }
}
