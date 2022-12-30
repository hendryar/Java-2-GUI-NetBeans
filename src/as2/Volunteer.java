package as2;


import java.io.Serializable;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

//This is the volunteer class, its the child class of User Class.
public class Volunteer extends User implements Serializable{
    private String dateOfbirth, occupation;

    //Default Constructor.
    public Volunteer() {
        dateOfbirth = "NotSet";
        occupation = "NotSet";
    }

    //Overloaded Constructor.
    public Volunteer(String username, String password, String fullName, String email, String phone, String dateOfbirth, String occupation) {
        super(username, password, fullName, email, phone);
        this.dateOfbirth = dateOfbirth;
        this.occupation = occupation;
    }

    //All getters and setters.
    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    //A very simple toString() method.
    @Override
    public String toString() {
        return "Volunteer{" +
                "dateOfbirth='" + dateOfbirth + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
