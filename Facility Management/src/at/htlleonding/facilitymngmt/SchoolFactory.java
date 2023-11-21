package at.htlleonding.facilitymngmt;

public class SchoolFactory implements FacilityFactory{

    @Override
    public School createFromString(String data) {
        String[] splittedData = data.split(";");
        City city = new City(Integer.parseInt(splittedData[5]), splittedData[6]);
        School school = new School(splittedData[2],
            city, splittedData[3], Integer.parseInt(splittedData[4]), splittedData[1]
        );
        return school;
    }
}
