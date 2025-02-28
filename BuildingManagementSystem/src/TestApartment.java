
/**
 *
 * @author Yousef
 */
public class TestApartment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanadianAddress address = new CanadianAddress("1030 South Park St.", "Halifax", "Nova Scotia", "B3H 2W3");
        Apartment apartment = new Apartment("Somerset Place Apartment", address, 10000, 100);

        System.out.println("The apartment is created with the following information");
        printApartmentInfo(apartment);

        apartment.setSquareFootage(120000);
        apartment.setTotalUnits(120);

        System.out.println("\nThe apartment is updated to the following information:");
        printApartmentInfo(apartment);

    }

    public static void printApartmentInfo(Apartment apartment) {
        System.out.println("Name: " + apartment.getName());
        System.out.println("Address:");
        apartment.getAddress().printAddress();
        System.out.println("Square footage: " + apartment.getSquareFootage());
        System.out.println("Total units: " + apartment.getTotalUnits());
    }

}
