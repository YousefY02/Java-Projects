

/**
 *
 * @author Yousef
 */
public class TestCanadianAddress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanadianAddress testAddress = new CanadianAddress();
        CanadianAddress SMUAddress = new CanadianAddress("923 Robie St.", "Halifax", "Nova Scotia", "B3H 3C3");

        System.out.println("The testAddress is created as: ");
        testAddress.printAddress();
        System.out.println("The SMUAddress is created as:");
        SMUAddress.printAddress();
        
        System.out.println("The testAddress is equal to SMUAddress? " + SMUAddress.equalAddresses(testAddress));
        
        testAddress.setStreetAddress("923 Robie St.");
        testAddress.setCity("Halifax");
        testAddress.setProvince("Nova Scotia");
        testAddress.setPostalCode("B3H 3C3");

        System.out.println("The testAddress is updated as:");
        testAddress.printAddress();

        System.out.println("The testAddress is equal to SMUAddress? " + SMUAddress.equalAddresses(testAddress));
    }

}


