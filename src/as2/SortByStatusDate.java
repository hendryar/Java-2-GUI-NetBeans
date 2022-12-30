package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

import java.util.Comparator;

//This class is used to sort requests according to its status, then by its posted date.
//It uses Java Comparator to do so.
//This is required for Collections.sort() to work.
public class SortByStatusDate implements Comparator<Request> {
    public int compare(Request a, Request b){
        //First it compares the status of the two.
        int status = b.getRequestStatus().compareTo(a.getRequestStatus());

        //If they have the same status, this will compare the published date of the requests.
        if(status == 0){
            status = a.getRequestDate().compareTo(b.getRequestDate());
        }

        return status;
    }
}
