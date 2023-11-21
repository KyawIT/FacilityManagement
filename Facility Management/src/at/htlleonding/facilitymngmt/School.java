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
        String lowerCaseType = schoolType.toLowerCase();
        if ("ahs-langform".equals(lowerCaseType))
            return SchoolType.AHS;
        else if ("kaufmännische schule".equals(lowerCaseType))
            return SchoolType.HAK;
        else if ("technische lehranstalt".equals(lowerCaseType))
            return SchoolType.HTL;
        else if ("kolleg".equals(lowerCaseType))
            return SchoolType.KOLLEG;
        else if ("mittelschule".equals(lowerCaseType) || "neue mittelschule".equals(lowerCaseType))
            return SchoolType.MS;
        else if ("volksschule".equals(lowerCaseType))
            return SchoolType.VS;
        else
            return SchoolType.SONSTIGE;
    }

    @Override
    public String toString() {
        return this.getName() + " " + "(" + this.getStreet() + " " + this.getHouseNumber()
                + ", " + this.getCity() + ") - " + this.getSchoolType();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        School school = (School) obj;
        return this.getCity().equals(school.getCity()) && this.getSchoolType().equals(school.getSchoolType());
    }
}
