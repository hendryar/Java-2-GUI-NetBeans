//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;

/**
 *
 * @author Hendry
 */
public class testingMain {
    public static void main(String[] args){
        System.out.println("main start");
        
       
        SchoolHELP sHelp = new SchoolHELP();
        sHelp.registerAdmin("asd","asd","Arya Ca","asd","asd","asd","asd","NotSet");
        sHelp.registerAdmin("asc","asc","Arya Za","asc","asc","asc","asc","NotSet");
        sHelp.registerAdmin("bbb","bbb","Arya Da","bbb","bbb","bbb","bbb","ID2");
        sHelp.registerAdmin("qwe","qwe","Beni Ab","qwe","qwe","qwe","qwe","ID1");
        sHelp.registerSchool("ID1", "asd school", "Aadress", "aCity");
        sHelp.registerSchool("ID2", "bbb school", "bDdress", "bCity");
        sHelp.registerVolunteer("v1","v1", "Arya Aa", "v1@gmail.com", "+62vol", "26/12/2001", "student");
        sHelp.registerVolunteer("v2","v1", "Zeto", "v1@gmail.com", "+62vol", "26/12/2001", "student");
        sHelp.createResourceRequest("routers needed","routers", 3, sHelp.getSchoolByIndex(0));
        sHelp.createResourceRequest("routers needed","routers", 3, sHelp.getSchoolByIndex(1));
        sHelp.createTutorialRequest("math class", "27/12/2022", "23:59", "grade 1", 20, sHelp.getSchoolByIndex(1));
        sHelp.createTutorialRequest("Not class", "22/12/2022", "23:59", "grade 12", 2, sHelp.getSchoolByIndex(0));




//ViewARequestVolunteer viewReq = new ViewARequestVolunteer(sHelp, 2,0);
        //viewReq.setVisible(true);
        ViewRequestVolunteerPage allReq= new ViewRequestVolunteerPage(sHelp, 2);
        allReq.setVisible(true);
        //SchoolHELPAdminMenu sadm = new SchoolHELPAdminMenu(sHelp, 0);
        //sadm.setVisible(true);
//        ViewAllUserByAdmin valluser = new ViewAllUserByAdmin(sHelp,0);
//        valluser.setVisible(true);



        
//        System.out.println(sHelp.sortAllUsers("default"));
//        System.out.println("---------------------------------------------------------");
//        System.out.println(sHelp.sortAllUsers("fullname"));
//        System.out.println("---------------------------------------------------------");
//        System.out.println(sHelp.sortAllUsers("default"));
//        System.out.println("---------------------------------------------------------");
//        System.out.println(sHelp.getAllUsers());
        
        //ViewRequestAdministrator reqAdm = new ViewRequestAdministrator(sHelp,3 );
        //reqAdm.setVisible(true);
        
    }
}
