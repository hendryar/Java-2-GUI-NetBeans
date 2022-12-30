package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

import java.io.Serializable;
import java.util.Date;

//This is the TutorialRequest class, child of Request class.
public class TutorialRequest extends Request implements Serializable{
    private String proposedDate, proposedTime, studentLevel;
    private int numStudents;

    //Default Constructor.
    public TutorialRequest() {
        proposedDate = "NotSet";
        proposedTime = "NotSet";
        studentLevel = "NotSet";
        numStudents = 0;
    }

    //Overloaded constructor.
    public TutorialRequest(String requestID, Date requestDate, String requestStatus, String description,
                           String proposedDate, String proposedTime, String studentLevel, int numStudents, School reqSchool) {
        super(requestID, requestDate, requestStatus, description, reqSchool);
        this.proposedDate = proposedDate;
        this.proposedTime = proposedTime;
        this.studentLevel = studentLevel;
        this.numStudents = numStudents;
    }

    //All setters and getters
    public String getProposedDate() {
        return proposedDate;
    }

    public void setProposedDate(String proposedDate) {
        this.proposedDate = proposedDate;
    }

    public String getProposedTime() {
        return proposedTime;
    }

    public void setProposedTime(String proposedTime) {
        this.proposedTime = proposedTime;
    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(String studentLevel) {
        this.studentLevel = studentLevel;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    //A toString() method that contains all the details we needed.
    @Override
    public String toString() {
        return getRequestID() + ".Tutorial Request for " + studentLevel + " level with " +
                numStudents + " students, proposed for " + proposedDate + ", at " + proposedTime + ". Posted on:" + getRequestDate() + ", By: " + getReqSchool().getSchoolName() +"\nDescription: " + getDescription();
    }
}
