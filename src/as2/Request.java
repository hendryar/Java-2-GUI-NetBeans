package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

import java.util.Date;
//This is the Request class, parent of TutorialRequest and Resource Request.
abstract class Request {
    private String requestID, requestStatus, description;
    private Date requestDate;
    private School reqSchool;

    //Default Constructor.
    public Request() {
        requestID = "NotSet";
        //Date newDate() is used here, only if default constructor is used.
        requestDate = new Date();
        requestStatus = "NotSet";
        description = "NotSet";
        reqSchool = new School();
    }

    //This is the overloaded constructor with parameters. This is the one we use on the program.
    public Request(String requestID, Date requestDate, String requestStatus, String description, School reqSchool) {
        this.requestID = requestID;
        this.requestDate = requestDate;
        this.requestStatus = requestStatus;
        this.description = description;
        this.reqSchool = reqSchool;
    }

    //Here are all the setters and getters for all the variables in this class.
    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public School getReqSchool() {
        return reqSchool;
    }

    public void setReqSchool(School reqSchool) {
        this.reqSchool = reqSchool;
    }

    //And this is a simple toString()
    @Override
    public String toString() {
        return "Request with ID: " + requestID + ", date posted: " + requestDate + ", Status: " +
                requestStatus + "\n description: " + description;
    }
}
