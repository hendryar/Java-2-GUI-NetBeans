//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;



import java.io.Serializable;



//SchoolAdmin class, child of User.
public class SchoolAdmin extends User implements Serializable{
    private String staffID, position, affiliatedSchool;

    //Default Constructor.
    public SchoolAdmin() {
        staffID = "NotSet";
        position = "NotSet";
        affiliatedSchool = "NotSet";
    }

    //Overloaded Constructor.
    public SchoolAdmin(String username, String password, String fullName, String email, String phone, String staffID, String position, String schoolId) {
        super(username, password, fullName, email, phone);
        this.staffID = staffID;
        this.position = position;
        if(schoolId != null){
            affiliatedSchool = schoolId;
        }
        else{
            affiliatedSchool = "NotSet";
        }

    }

    //All setters and getters.
    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAffiliatedSchoolID() {
        return affiliatedSchool;
    }

    public void setAffiliatedSchool(String affiliatedSchool) {
        this.affiliatedSchool = affiliatedSchool;
    }

    
    public void updateProfile(String inFullName, String inEmailAdd, String inPhoneNumber, String inStaffId, String inPosition, String inPassword){
        super.setFullName(inFullName);
        super.setEmail(inEmailAdd);
        super.setPhone(inPhoneNumber);
        super.setPassword(inPassword);
        this.staffID = inStaffId;
        this.position = inPosition;
    }
    //A very simple toString() method.
    @Override
    public String toString() {
        return "SchoolAdmin{" +
                "staffID='" + staffID + '\'' +
                ", position='" + position + '\'' +
                ", affiliatedSchool='" + affiliatedSchool + '\'' +
                '}';
    }
}
