import java.util.Date;

public class Person {

    private int height;
    private boolean gender;
    private String  firstName;
    private  String lastName;
    private Date Dof;
    private int wight;




    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDof() {
        return Dof;
    }

    public void setDof(Date dof) {
        Dof = dof;
    }

    public int getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", gender=" + gender +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Dof=" + Dof +
                ", wight=" + wight +
                '}';
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public Person() {
    }

    public Person(int height, boolean gender, String firstName, String lastName, Date dof, int wight) {
        this.height = height;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        Dof = dof;
        this.wight = wight;


    }
}