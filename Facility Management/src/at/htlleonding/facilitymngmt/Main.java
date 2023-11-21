package at.htlleonding.facilitymngmt;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*FacilityRepository.getInstance().readFromFile("data/museums_L_LL.csv", new MuseumFactory());
        FacilityRepository.getInstance().readFromFile("data/schools_LL.csv", new SchoolFactory());

        System.out.print(FacilityRepository.getInstance());

        System.out.println("-------------------------");
        System.out.println("All museums with religious foci:");

        List<Facility> religiousMuseums = FacilityRepository.getInstance().getFacilitiesByPredicate(f -> {
            return ((f instanceof Museum) && ((Museum)f).hasCollectionFocus("Religion"));
        });

        for(Facility currFacility : religiousMuseums) {
            System.out.println(currFacility);
        }

        System.out.println("-------------------------");
        System.out.println("All elementary schools between Traun and Haid:");

        List<Facility> elementarySchoolsBetweenTraunAndHaid = FacilityRepository.getInstance().getFacilitiesByPredicate(f -> {
            return (f instanceof School) &&
                    ((School)f).getSchoolType().equals(SchoolType.VS) &&
                    4050 <= f.getCity().getZipCode() &&
                    f.getCity().getZipCode() <= 4053;
        });

        for(Facility currFacility : elementarySchoolsBetweenTraunAndHaid) {
            System.out.println(currFacility);
        }*/

    }
}
