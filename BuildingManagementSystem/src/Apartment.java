

/**
 *
 * @author Yousef
 */
public class Apartment extends Building {
    private int totalUnits;
    public Apartment(String name,CanadianAddress address,int squareFootage,int totalUnits){
        super(name,address,squareFootage);
        this.totalUnits = totalUnits;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }
    
}
