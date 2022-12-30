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
public class ViewOffersAdministrator extends javax.swing.JFrame {


  
    private SchoolHELP sHelp;
    private int adminIndex, requestIndex;
    DefaultTableModel model;
    private Request currentRequest;
    private SchoolAdmin loggedInAdmin;
    public ViewOffersAdministrator(SchoolHELP sHelpIn, int adminIndexIn, int requestIndexIn) {
        sHelp = sHelpIn;
        adminIndex = adminIndexIn;
        requestIndex = requestIndexIn;
        currentRequest = sHelp.getRequestByIndex(requestIndexIn);
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        populateTf();
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
        jPanel4 = new javax.swing.JPanel();
        lbRequestId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfRequestID = new javax.swing.JTextField();
        tfdatePosted = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfStudentNum = new javax.swing.JTextField();
        tfStudentLevel = new javax.swing.JTextField();
        tfNumReqOrPropTime = new javax.swing.JTextField();
        tfResTypeOrPropDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        btCancel = new javax.swing.JButton();
        btProceed = new javax.swing.JButton();
        lbReqId = new javax.swing.JLabel();
        tfOfferID = new javax.swing.JTextField();

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
        lbWelcome.setText("Viewing a Request Details and Offers");

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
                .addGap(82, 82, 82)
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
                .addGap(24, 24, 24))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Occupation", "Remarks"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        lbRequestId.setText("Request ID:");

        jLabel5.setText("Status");

        jLabel6.setText("Date Posted");

        jLabel7.setText("Description:");

        jLabel8.setText("resType/PropDate");

        jLabel9.setText("NumReq/PropTime");

        jLabel10.setText("Student Level");

        jLabel11.setText("Student Num");

        taDesc.setColumns(20);
        taDesc.setRows(5);
        jScrollPane2.setViewportView(taDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRequestId)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdatePosted, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(tfRequestID, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNumReqOrPropTime, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(tfStudentNum, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(tfResTypeOrPropDate, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(tfStudentLevel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfResTypeOrPropDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNumReqOrPropTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfStudentLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfStudentNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRequestId)
                            .addComponent(tfRequestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfdatePosted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
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

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btProceed.setText("Proceed");
        btProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProceedActionPerformed(evt);
            }
        });

        lbReqId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbReqId.setText("Select Offer ID to View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpAdminRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lbReqId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOfferID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpAdminRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReqId)
                    .addComponent(tfOfferID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        ViewRequestAdministrator viewReq = new ViewRequestAdministrator(sHelp, adminIndex);
        viewReq.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    
    
    public void populateTf(){
        tfRequestID.setText("yes");
        tfdatePosted.setText("tes");
        tfStatus.setText(currentRequest.getRequestStatus());
        taDesc.setText(currentRequest.getDescription());
        
        if(sHelp.findRequestType(currentRequest).equalsIgnoreCase("Tutorial Request")){
            TutorialRequest tutRequest = (TutorialRequest) currentRequest;
            tfNumReqOrPropTime.setText(tutRequest.getProposedTime());
            tfResTypeOrPropDate.setText(tutRequest.getProposedTime());
            tfStudentNum.setText(Integer.toString(tutRequest.getNumStudents()));
            tfStudentLevel.setText(tutRequest.getStudentLevel());
            tfStudentNum.setVisible(true);
            tfStudentLevel.setVisible(true);
        }
        else{
            ResourceRequest resRequest = (ResourceRequest) currentRequest;
            tfNumReqOrPropTime.setText(Integer.toString(resRequest.getNumRequired()));
            tfResTypeOrPropDate.setText(resRequest.getResourceType());
            tfStudentNum.setVisible(false);
            tfStudentLevel.setVisible(false);
        }
        
        //Makes sure its not editable
        tfRequestID.setEditable(false);
        tfdatePosted.setEditable(false);
        tfStatus.setEditable(false);
        taDesc.setEditable(false);
        tfNumReqOrPropTime.setEditable(false);
        tfResTypeOrPropDate.setEditable(false);
        tfStudentNum.setEditable(false);
        tfStudentLevel.setEditable(false);

    
        
        
    }
    
    //dibawah tinggal diganti openpagenya jadi page yang baru
    private void btProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProceedActionPerformed
        String offerId = tfOfferID.getText();
        
        String[] actionOption = {"Decline Offer", "Accept Offer"};
        int selectedOption = JOptionPane.showOptionDialog(null, "Accept Offer?",
                "Review Offer",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, actionOption, actionOption[0]);
        
        if(selectedOption == 0){
            sHelp.declineOffer(offerId);
            ViewRequestAdministrator viewReq = new ViewRequestAdministrator(sHelp, adminIndex);
            viewReq.setVisible(true);
            dispose();
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Offer Accepted, Returning to Main Menu!");
            sHelp.acceptOffer(offerId);
            SchoolAdminMenu schAdmMenu = new SchoolAdminMenu(sHelp, adminIndex);
            schAdmMenu.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btProceedActionPerformed


    public void addRowToJtable(){
        System.out.println("entering addRowToJtable");
        
        Object rowData[] = new Object[5];
        List <Offer> listOfOffers = sHelp.viewOfferForReq(sHelp.getRequestByIndex(requestIndex).getRequestID());
        
        
        
        for(int i =0; i< listOfOffers.size(); i++){
            //ambil volunteer username dari offer
            //getuserbyusername
            
            String volUsername = listOfOffers.get(i).getVolUserName();
            Volunteer currentVolunteer = (Volunteer)sHelp.getUserByUsername(volUsername);
           
            int volAge = sHelp.calculateVolAge(currentVolunteer);
            //offer id
            rowData[0] = listOfOffers.get(i).getOfferID();
            //volunteer name
            rowData[1] = currentVolunteer.getFullName();
            //volunteer age
            rowData[2] = volAge;
            //volunteer occupation
            rowData[3] = currentVolunteer.getOccupation();
            //remarks
            rowData[4] = listOfOffers.get(i).getRemarks();

            model.addRow(rowData);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btProceed;
    private javax.swing.JDialog firstTimeSetupDialog;
    private javax.swing.JPanel firstTimeSetupDialogPanel;
    private javax.swing.JPanel helpAdminRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbReqId;
    private javax.swing.JLabel lbRequestId;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JButton setupConfirmButton;
    private javax.swing.JTextArea taDesc;
    private javax.swing.JTextField tfNumReqOrPropTime;
    private javax.swing.JTextField tfOfferID;
    private javax.swing.JTextField tfRequestID;
    private javax.swing.JTextField tfResTypeOrPropDate;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfStudentLevel;
    private javax.swing.JTextField tfStudentNum;
    private javax.swing.JTextField tfdatePosted;
    // End of variables declaration//GEN-END:variables
}
