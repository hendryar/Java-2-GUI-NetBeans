//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;

import java.util.Comparator;

/**
 *
 * @author Hendry
 */
public class SortNameByFullName implements Comparator<User>{
    public int compare(User a, User b){
        return a.getFullName().compareTo(b.getFullName());
    }
}
