package at.htlleonding.facilitymngmt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FacilityRepository {
    private Map<Integer, City> cities;
    List<Facility> facilityList;
    private static FacilityRepository facilityRepository;

    FacilityRepository() {
        facilityList = new ArrayList<>();
        cities = new TreeMap<>();
    }

    public static FacilityRepository getInstance() {
        if (facilityRepository == null)
            facilityRepository = new FacilityRepository();

        return facilityRepository;
    }

    public List<Facility> getFacilitiesByZipCode(int postalCode) {
        List<Facility> res = new ArrayList<>();
        for (Facility facility : facilityList) {
            if (facility.getCity().getZipCode() == postalCode)
                res.add(facility);
        }
        if (facilityList.isEmpty())
            throw new FacilityManagementException("Zip code not found");
        return facilityList;
    }

    public City createCityIfNotExists(int postalCode, String cityName) {
        City existingCity = cities.get(postalCode);
        if (existingCity != null)
            return existingCity;
        City newCity = new City(postalCode, cityName);
        cities.put(postalCode, newCity);
        return newCity;
    }

    public City getCityByZipCode(int postalCode) {
        City city = cities.get(postalCode);
        if (city == null) {
            throw new FacilityManagementException(FacilityManagementException.ZIP_CODE_NOT_FOUND_MESSAGE);
        }
        return city;
    }

    public boolean addFacility(Facility museum) {
        if (facilityList.contains(museum))
            return false;
        return facilityList.add(museum);
    }

    public int readFromFile(String fileName, FacilityFactory facilityFactory) {
        int errCnt = 0;
        try {
            Path path = Paths.get(fileName);
            String[] lines = Files.readAllLines(path).toArray(new String[0]);

            for (int i = 1; i < lines.length; i++) {
                Facility facility = facilityFactory.createFromString(lines[i]);
                if (facility != null)
                    addFacility(facility);
                else
                    errCnt++;
            }
        } catch (IOException e) {
            throw new FacilityManagementException(FacilityManagementException.IO_EXCEPTION_MESSAGE, e);
        }

        return errCnt;
    }

    public List<Facility> getFacilitiesByPredicate(Object religion) {
        return null;
    }
}
