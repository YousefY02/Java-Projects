public class Student {

    private String aNum;
    private String firstName,lastName;

    public Student(String aNum,String firstName, String lastName){
        this.aNum=aNum;
        this.lastName=lastName;
        this.firstName=firstName;



    }

    public String getaNum() {
        return aNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
