//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;

import javax.swing.JOptionPane;

/**
 *
 * @author Hendry
 */
public class ResourceRequestForm extends javax.swing.JFrame {

    /**
     * Creates new form SchoolHelpGUI
     */
    
    private SchoolHELP sHelp;
    int schoolAdminIndex;
    
  
    public ResourceRequestForm(SchoolHELP sHelpIn, int adminIndexIn) {
        initComponents();
        sHelp = sHelpIn;
        schoolAdminIndex = adminIndexIn;
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
        jPanel2 = new javax.swing.JPanel();
        lbResourceType = new javax.swing.JLabel();
        lbNumbersNeeded = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        tfResourceType = new javax.swing.JTextField();
        tfNumbersRequired = new javax.swing.JTextField();
        btProceed = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        lbResourceType.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbResourceType.setText("Resource Type");

        lbNumbersNeeded.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbNumbersNeeded.setText("Numbers Required");

        lbDescription.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDescription.setText("Description");

        tfResourceType.setToolTipText("");
        tfResourceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResourceTypeActionPerformed(evt);
            }
        });

        btProceed.setText("Proceed");
        btProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProceedActionPerformed(evt);
            }
        });

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(btProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbResourceType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNumbersNeeded, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNumbersRequired)
                            .addComponent(tfResourceType, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResourceType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfResourceType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumbersNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumbersRequired, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btProceed)
                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("SchoolHELP");

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancel)
                .addGap(50, 50, 50))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Submit Resource Request");

        javax.swing.GroupLayout helpAdminRegistrationLayout = new javax.swing.GroupLayout(helpAdminRegistration);
        helpAdminRegistration.setLayout(helpAdminRegistrationLayout);
        helpAdminRegistrationLayout.setHorizontalGroup(
            helpAdminRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpAdminRegistrationLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(helpAdminRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpAdminRegistrationLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpAdminRegistrationLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101))))
        );
        helpAdminRegistrationLayout.setVerticalGroup(
            helpAdminRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpAdminRegistrationLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpAdminRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpAdminRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProceedActionPerformed
        String desc, resourceType;
        int numRequired;
        
        //get logged in admin affiliated schoolId
        //findSchoolIndex -> SchoolID
        SchoolAdmin loggedInAdmin = (SchoolAdmin)sHelp.getUserByIndex(schoolAdminIndex);
        System.out.println("admin Affiliated output: " + loggedInAdmin.getAffiliatedSchoolID());
        String loggedSchoolId = loggedInAdmin.getAffiliatedSchoolID();
        int loggedSchoolIndex = sHelp.findSchoolIndex(loggedSchoolId);
        System.out.println("found school index: "+ loggedSchoolIndex);
        School loggedInSchool = sHelp.getSchoolByIndex(loggedSchoolIndex);
        System.out.println("schooltosting: " + loggedInSchool.toString());
        desc = taDescription.getText();
        resourceType = tfResourceType.getText();
        numRequired = Integer.parseInt(tfNumbersRequired.getText());
        
        sHelp.createResourceRequest(desc, resourceType, numRequired, loggedInSchool);
        
        SchoolAdminMenu schAdmMenu = new SchoolAdminMenu(sHelp, schoolAdminIndex);
        JOptionPane.showMessageDialog(null, "Request Submitted!");
        schAdmMenu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btProceedActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        SchoolAdminMenu schAdmMenu = new SchoolAdminMenu(sHelp, schoolAdminIndex);
        schAdmMenu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btCancelActionPerformed

    private void tfResourceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResourceTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfResourceTypeActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btProceed;
    private javax.swing.JDialog firstTimeSetupDialog;
    private javax.swing.JPanel firstTimeSetupDialogPanel;
    private javax.swing.JPanel helpAdminRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbNumbersNeeded;
    private javax.swing.JLabel lbResourceType;
    private javax.swing.JButton setupConfirmButton;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfNumbersRequired;
    private javax.swing.JTextField tfResourceType;
    // End of variables declaration//GEN-END:variables
}
