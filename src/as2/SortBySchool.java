package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

import java.util.Comparator;

//This class is used to sort requests according to its school's ID (hence, its name).
//It uses Java Comparator to do so.
//This is required for Collections.sort() to work.
public class SortBySchool implements Comparator<Request> {
    //This simply compares the two requests school IDs.
    //I chose ID because its unique to the school.
    public int compare(Request a, Request b){
        return a.getReqSchool().getSchoolID().compareTo(b.getReqSchool().getSchoolID());
    }

}