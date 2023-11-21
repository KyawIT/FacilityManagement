package at.htlleonding.facilitymngmt;

public class MuseumFactory implements FacilityFactory {

    @Override
    public Museum createFromString(String data) {
        String[] splittedData = data.split(";");
        City city = new City(Integer.parseInt(splittedData[3]), splittedData[4]);
        Museum museum = new Museum(splittedData[0], city, splittedData[1], Integer.parseInt(splittedData[2]));
        String[] splittedFoci = splittedData[5].split(", ");
        for (String e: splittedFoci) {
            museum.addCollectionFocus(e);
        }
        return museum;
    }
}
