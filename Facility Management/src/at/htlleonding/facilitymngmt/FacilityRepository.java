package at.htlleonding.facilitymngmt;

import java.util.List;

public class FacilityRepository {
    public static FacilityRepository getInstance() {
        return null;
    }

    public List<Facility> getFacilitiesByZipCode(int i) {
        return null;
    }

    public City createCityIfNotExists(int i, String graz) {
        return null;
    }

    public City getCityByZipCode(int i) {
        return null;
    }

    public boolean addFacility(Facility museum) {
        return false;
    }

    public int readFromFile(String s, FacilityFactory museumFactory) {
        return 0;
    }

    public List<Facility> getFacilitiesByPredicate(Object religion) {
        return null;
    }
}
