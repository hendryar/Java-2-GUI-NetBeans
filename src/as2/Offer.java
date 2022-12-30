package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//Offer class
//Nothing is changed here from assignment 1.

import java.io.Serializable;
import java.util.Date;
public class Offer implements Serializable{
    //I added more variables to make the program function accordingly.
    private String remarks, offerStatus, offerID, volUserName, requestedID;
    private Date offerDate;

    //Default constructor
    public Offer() {
        //Date newDate() is used here, only if default constructor is used.
        offerDate = new Date();
        remarks = "NotSet";
        offerStatus = "NotSet";
        offerID = "NotSet";
        volUserName = "NotSet";
        requestedID = "NotSet";
    }
    //Overloaded constructor.
    public Offer(Date offerDate, String remarks, String offerStatus,
     String requestedID, String offerID, String volUserName) {
        this.offerDate = offerDate;
        this.remarks = remarks;
        this.offerStatus = offerStatus;
        this.requestedID = requestedID;
        this.offerID = offerID;
        this.volUserName = volUserName;
    }

    //Setter and getters for all the variables in this class.
    public Date getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(Date offerDate) {
        this.offerDate = offerDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }


    public String getOfferID() {
        return offerID;
    }

    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }

    public String getVolUserName() {
        return volUserName;
    }

    public void setVolUserName(String volUserName) {
        this.volUserName = volUserName;
    }

    public String getRequestedID() {
        return requestedID;
    }

    public void setRequestedID(String requestedID) {
        this.requestedID = requestedID;
    }

    //A very simple toString() method.
    @Override
    public String toString() {
        return "Offer{" +
                "offerDate='" + offerDate + '\'' +
                ", remarks='" + remarks + '\'' +
                ", offerStatus='" + offerStatus + '\'' +
                '}';
    }
}
