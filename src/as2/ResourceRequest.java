package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

import java.io.Serializable;
import java.util.Date;
//ResourceRequest class, child of Request.
public class ResourceRequest extends Request implements Serializable{
    private String resourceType;
    int numRequired;

    //Default Constructor.
    public ResourceRequest() {
        resourceType = "NotSet";
        numRequired = 0;
    }

    //Overloaded Constructor
    public ResourceRequest(String requestID, Date requestDate, String requestStatus, String description, String resourceType, int numRequired, School reqSchool) {
        super(requestID, requestDate, requestStatus, description, reqSchool);
        this.resourceType = resourceType;
        this.numRequired = numRequired;
    }

    //All setters and getter.
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getNumRequired() {
        return numRequired;
    }

    public void setNumRequired(int numRequired) {
        this.numRequired = numRequired;
    }

    //A toString() method that contains all the details we needed.
    @Override
    public String toString() {
        return getRequestID() + ".Resource Request for " + numRequired + "x " +resourceType + ". Posted on: "
                + getRequestDate() + ", By: " + getReqSchool().getSchoolName() + "\nDescription: " + getDescription();
    }
}
