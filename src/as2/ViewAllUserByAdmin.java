//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author Hendry
 */
public class ViewAllUserByAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SchoolHelpGUI
     */
    
    String selectedOption = "Unsorted";
  
    private SchoolHELP sHelp;
    private int helpAdminIndex;
    DefaultTableModel model;
    public ViewAllUserByAdmin(SchoolHELP sHelpIn, int helpAdminIndexIn) {
        sHelp = sHelpIn;
        helpAdminIndex = helpAdminIndexIn;
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToJtable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstTimeSetupDialog = new javax.swing.JDialog();
        firstTimeSetupDialogPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        setupConfirmButton = new javax.swing.JButton();
        helpAdminRegistration = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbWelcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbSortOption = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btBack = new javax.swing.JButton();

        firstTimeSetupDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        firstTimeSetupDialog.setResizable(false);

        firstTimeSetupDialogPanel.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to SchoolHELP");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Please Register a SchoolHELP Administrator!");

        setupConfirmButton.setText("Proceed");

        javax.swing.GroupLayout firstTimeSetupDialogPanelLayout = new javax.swing.GroupLayout(firstTimeSetupDialogPanel);
        firstTimeSetupDialogPanel.setLayout(firstTimeSetupDialogPanelLayout);
        firstTimeSetupDialogPanelLayout.setHorizontalGroup(
            firstTimeSetupDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstTimeSetupDialogPanelLayout.createSequentialGroup()
                .addGroup(firstTimeSetupDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstTimeSetupDialogPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(firstTimeSetupDialogPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(setupConfirmButton))
                    .addGroup(firstTimeSetupDialogPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        firstTimeSetupDialogPanelLayout.setVerticalGroup(
            firstTimeSetupDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstTimeSetupDialogPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(setupConfirmButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout firstTimeSetupDialogLayout = new javax.swing.GroupLayout(firstTimeSetupDialog.getContentPane());
        firstTimeSetupDialog.getContentPane().setLayout(firstTimeSetupDialogLayout);
        firstTimeSetupDialogLayout.setHorizontalGroup(
            firstTimeSetupDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstTimeSetupDialogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        firstTimeSetupDialogLayout.setVerticalGroup(
            firstTimeSetupDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstTimeSetupDialogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 480));
        setResizable(false);

        helpAdminRegistration.setPreferredSize(new java.awt.Dimension(680, 480));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("SchoolHELP");

        lbWelcome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbWelcome.setText("Viewing All Registered Users");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(lbWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWelcome)
                .addGap(20, 20, 20))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "FullName", "Username", "Email", "Phone", "Staff-ID", "Position", "DoB", "Occupation"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        cbSortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unsorted", "Full Name" }));
        cbSortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortOptionActionPerformed(evt);
            }
        });

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbSortOption, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cbSortOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout helpAdminRegistrationLayout = new javax.swing.GroupLayout(helpAdminRegistration);
        helpAdminRegistration.setLayout(helpAdminRegistrationLayout);
        helpAdminRegistrationLayout.setHorizontalGroup(
            helpAdminRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpAdminRegistrationLayout.createSequentialGroup()
                .addGroup(helpAdminRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpAdminRegistrationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        helpAdminRegistrationLayout.setVerticalGroup(
            helpAdminRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpAdminRegistrationLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpAdminRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpAdminRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Takes in sort parameter from the combobox.
    //Reset the table, then fill in the details
    private void cbSortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortOptionActionPerformed
        selectedOption = cbSortOption.getSelectedItem().toString();
        model.setRowCount(0);
        addRowToJtable();
    }//GEN-LAST:event_cbSortOptionActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        SchoolHELPAdminMenu schAdmMenu = new SchoolHELPAdminMenu(sHelp, helpAdminIndex);
        schAdmMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btBackActionPerformed


    public void addRowToJtable(){
        System.out.println("entering addRowToJtable");
        
        Object rowData[] = new Object[9];
        List <User> listOfUsers;
        
        
        if(selectedOption.equalsIgnoreCase("Unsorted")){
            listOfUsers = sHelp.sortAllUsers("Unsorted");
            System.out.println("masuk ke sorting unsorted");
        }
        else{
            System.out.println("masuk ke fullname");
            
            listOfUsers = sHelp.sortAllUsers("fullname");
        }
        
        
        for(int i =0; i< listOfUsers.size(); i++){
            System.out.println("masuk ke sorting");
            String userType = sHelp.findUserType(listOfUsers.get(i));
            
            System.out.println("row 1 2 3 4 mausk");
            //FullName
            rowData[1] = listOfUsers.get(i).getFullName();
            //username
            rowData[2] = listOfUsers.get(i).getUsername();
            //Email
            rowData[3] = listOfUsers.get(i).getEmail();
            //phoneNo
            rowData[4] = listOfUsers.get(i).getPhone();
          
            System.out.println("dibawah masuk if admin");
            if(userType.equalsIgnoreCase("Administrator")){
                SchoolAdmin tempAdmin = (SchoolAdmin) listOfUsers.get(i);
                //User type
                rowData[0] = "Administrator";
                //StaffId
                rowData[5] = tempAdmin.getStaffID();
                //position
                rowData[6] = tempAdmin.getPosition();
                //Date of Birth set to "-"
                //because it's volunteer's data.
                rowData[7] = "-";
                //Occupation also set to "-"
                rowData[8] = "-";
                   
            }
            
            else{
                System.out.println("bisa masuk vol");
                Volunteer tempVol = (Volunteer) listOfUsers.get(i);
                //User type
                rowData[0] = "Volunteer";
                //StaffId set to "-"
                //because it's admin's data.
                rowData[5] = "-";
                //position also set to "-"
                rowData[6] = "-";
                //Date of Birth
                rowData[7] = tempVol.getDateOfbirth();
                //Occupation
                rowData[8] = tempVol.getOccupation();
   
            }
            model.addRow(rowData);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JComboBox<String> cbSortOption;
    private javax.swing.JDialog firstTimeSetupDialog;
    private javax.swing.JPanel firstTimeSetupDialogPanel;
    private javax.swing.JPanel helpAdminRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JButton setupConfirmButton;
    // End of variables declaration//GEN-END:variables
}
