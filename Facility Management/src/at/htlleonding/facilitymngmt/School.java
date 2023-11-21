package at.htlleonding.facilitymngmt;

public class School extends Facility{
    private String schoolType;
    public School(String name, City city, String street, int houseNumber, String schoolType) {
        super(name, city, street, houseNumber);
        this.schoolType = schoolType;
    }

    @Override
    public int compareTo(Facility o) {
        return 0;
    }

    public SchoolType getSchoolType() {
        throw new UnsupportedOperationException("This method is not implemented yet");
    }

}
