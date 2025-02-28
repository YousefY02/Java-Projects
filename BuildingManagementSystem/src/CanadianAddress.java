
/**
 *
 * @author Yousef
 */
public class CanadianAddress {

    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private String country;
    public CanadianAddress() {

    }

    public CanadianAddress(String streetAddress, String city, String province, String postalCode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return streetAddress + ", " + city + ",\n" + province + " " + postalCode + ", Canada";
    }

    @Override
    public boolean equals(Object address) {

        return streetAddress.equals(((CanadianAddress) address).streetAddress)
                && city.equals(((CanadianAddress) address).city)
                && province.equals(((CanadianAddress) address).province)
                && postalCode.equals(((CanadianAddress) address).postalCode)
                && country.equals(((CanadianAddress) address).country);
    }
}
