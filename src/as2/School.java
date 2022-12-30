//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;


import java.io.Serializable;

public class School implements Serializable{
    private String schoolID, schoolName, address, city;
    //Default constructor.
    public School() {
        schoolID = "NotSet";
        schoolName = "NotSet";
        address = "NotSet";
        city = "Notset";
    }

    //Overloaded Constructor.
    public School(String schoolID, String schoolName, String address, String city) {
        this.schoolID = schoolID;
        this.schoolName = schoolName;
        this.address = address;
        this.city = city;
    }

    //All setters and getters
    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //A very simple toString();
    @Override
    public String toString() {
        return "School{" +
                "schoolID='" + schoolID + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
