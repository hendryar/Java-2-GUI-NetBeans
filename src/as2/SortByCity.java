//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form



package as2;



import java.util.Comparator;

//This class is used to sort requests according to its school's city.
//It uses Java Comparator to do so.
//This is required for Collections.sort() to work.
public class SortByCity implements Comparator<Request> {

//Simply compares the two requests school's city.
    public int compare(Request a, Request b){
        return a.getReqSchool().getCity().compareTo(b.getReqSchool().getCity());
    }

}
