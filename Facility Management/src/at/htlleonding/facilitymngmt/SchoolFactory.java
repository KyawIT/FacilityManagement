package at.htlleonding.facilitymngmt;

public class SchoolFactory implements FacilityFactory{

    @Override
    public School createFromString(String data) {
        String[] splittedData = data.split(";");

        try {
            City city = FacilityRepository.getInstance().createCityIfNotExists(Integer.parseInt(splittedData[5]), splittedData[6]);
            return new School(splittedData[2],
                    city, splittedData[3], Integer.parseInt(splittedData[4]), splittedData[1]
            );
        }catch (Exception e){
            return null;
        }
    }
}
