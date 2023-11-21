package at.htlleonding.facilitymngmt;

import jdk.jshell.spi.ExecutionControl;

public class Museum extends Facility{
    public Museum(String name, City city, String street, int houseNumber) {
        super(name, city, street, houseNumber);
    }

    public boolean hasCollectionFocus(String kunst) {
        throw new UnsupportedOperationException("This method is not implemented yet");
    }

    @Override
    public int compareTo(Facility o) {
        return 0;
    }

    public boolean addCollectionFocus(String naturwissenschaft) {
        throw new UnsupportedOperationException("This method is not implemented yet");
    }

}
