package as2;

//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form

import java.time.LocalDate;
import java.util.Comparator;

//This class is used to sort requests according to its proposed date.
//It uses Java Comparator to do so.
//This is required for Collections.sort() to work.
public class SortByProposedDate implements Comparator<Request> {
    public int compare(Request aR, Request bR){
        
        //Since we're comparing proposed date, we downcast first.
        TutorialRequest a = (TutorialRequest) aR;
        TutorialRequest b = (TutorialRequest) bR;
        
        //this gets the proposed date, changes it from string to localdate
        //this is done in order to properly compare the two properly by date.
        String propDateA = a.getProposedDate();
        int dayA = Integer.parseInt(propDateA.substring(0,2));
        int monthA = Integer.parseInt(propDateA.substring(3,5));
        int yearA = Integer.parseInt(propDateA.substring(6));
        LocalDate dateA = LocalDate.of(yearA,monthA,dayA);
        
        String propDateB = b.getProposedDate();
        int dayB = Integer.parseInt(propDateB.substring(0,2));
        int monthB = Integer.parseInt(propDateB.substring(3,5));
        int yearB = Integer.parseInt(propDateB.substring(6));
        LocalDate dateB = LocalDate.of(yearB,monthB,dayB);
        
        return dateA.compareTo(dateB);
    }
}
