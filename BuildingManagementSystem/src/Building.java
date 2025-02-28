

/**
 *
 * @author Yousef
 */
public class Building {
    private String name;
    private CanadianAddress address;
    private int squareFootage;

    public Building(String name, CanadianAddress address, int squareFootage) {
        this.name = name;
        this.address = address;
        this.squareFootage = squareFootage;
    }

    public CanadianAddress getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    
    
}
