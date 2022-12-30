//Name: Hendry Suryadi Arya
//Student No: E1900337
//JDK Version: 17.0.1
//Assignment 2
//IDE: Apache NetBeans
//Change Profile Form
package as2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Hendry
 */
public class SchoolHELPAdminMenu extends javax.swing.JFrame {

    
    
    private SchoolHELP sHelp;
    int helpAdminIndex;
    /**
     * Creates new form SchoolHelpGUI
     */
        
    public SchoolHELPAdminMenu(SchoolHELP sHelpIn, int adminIndexIn) {
        initComponents();
        sHelp = sHelpIn;
        helpAdminIndex = adminIndexIn;
        lbAdmName.setText("Welcome Administrator " + sHelp.getUserByIndex(helpAdminIndex).getFullName());
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbAdmName = new javax.swing.JLabel();
        btViewAllUser = new javax.swing.JButton();
        btRegSchool = new javax.swing.JButton();
        btSaveData = new javax.swing.JButton();
        btLoadData = new javax.swing.JButton();
        btRegSchoolAdmin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 480));
        setResizable(false);

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

        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLogout)
                .addGap(33, 33, 33))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Welcome SchoolHELP Admin!");

        lbAdmName.setText("Administrator: ");

        btViewAllUser.setText("View all Users");
        btViewAllUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewAllUserActionPerformed(evt);
            }
        });

        btRegSchool.setText("Register School");
        btRegSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegSchoolActionPerformed(evt);
            }
        });

        btSaveData.setText("Save Data");
        btSaveData.setToolTipText("");
        btSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveDataActionPerformed(evt);
            }
        });

        btLoadData.setText("Load Data");
        btLoadData.setToolTipText("");
        btLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoadDataActionPerformed(evt);
            }
        });

        btRegSchoolAdmin1.setText("Register School Admin");
        btRegSchoolAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegSchoolAdmin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btViewAllUser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btRegSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btRegSchoolAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(104, 104, 104))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(lbAdmName)))
                            .addGap(82, 82, 82)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(lbAdmName)
                .addGap(37, 37, 37)
                .addComponent(btRegSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRegSchoolAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btViewAllUser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaveData)
                    .addComponent(btLoadData))
                .addGap(33, 33, 33))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveDataActionPerformed
        FileOutputStream fileOut = null;
        try {
            var writeFileName = javax.swing.JOptionPane.showInputDialog("Enter File Name");
            System.out.println("fileoutputstream dibawah");
            fileOut = new FileOutputStream(writeFileName + ".ser");
            System.out.println("object out stream dibawah");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            System.out.println("write obj schoolhelp");
            out.writeObject(sHelp);
            System.out.println("closing output stream");
            out.close();
            System.out.println("closing fielout stream");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileOut.close();
            } catch (IOException ex) {
                Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btSaveDataActionPerformed

    private void btViewAllUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewAllUserActionPerformed
        ViewAllUserByAdmin viewUsers = new ViewAllUserByAdmin(sHelp, helpAdminIndex);
        viewUsers.setVisible(true);
        dispose();
    }//GEN-LAST:event_btViewAllUserActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        LoginVolunteerForm volWindow = new LoginVolunteerForm(sHelp);
        volWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btRegSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegSchoolActionPerformed
        // TODO add your handling code here:
        RegisterSchoolForm regSchoolWindow = new RegisterSchoolForm(sHelp, helpAdminIndex);
        regSchoolWindow.setVisible(true);
        dispose();


    }//GEN-LAST:event_btRegSchoolActionPerformed

    private void btLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoadDataActionPerformed
        
        FileInputStream fileIn = null;
        try {
            int fileChooserResponse;
            String filePath = null;
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            fileChooserResponse = fileChooser.showOpenDialog(null); // select file to open 0 = selected file, 1 = cancel / exit.
            if(fileChooserResponse == JFileChooser.APPROVE_OPTION){
                filePath = fileChooser.getSelectedFile().getAbsolutePath();
            }   fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            sHelp = (SchoolHELP) in.readObject();
            in.close();
            fileIn.close();
            
            //Once imported a message will be shown and admin will be logged out from the system.
            JOptionPane.showMessageDialog(null, "Data Imported!\nLogging Out From System!");
            LoginVolunteerForm logVolNew = new LoginVolunteerForm(sHelp);
            logVolNew.setVisible(true);
            dispose();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileIn.close();
            } catch (IOException ex) {
                Logger.getLogger(SchoolHELPAdminMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_btLoadDataActionPerformed

    private void btRegSchoolAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegSchoolAdmin1ActionPerformed
        ViewAllSchool viewSch = new ViewAllSchool(sHelp, helpAdminIndex);
        viewSch.setVisible(true);
        dispose();

    }//GEN-LAST:event_btRegSchoolAdmin1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLoadData;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btRegSchool;
    private javax.swing.JButton btRegSchoolAdmin1;
    private javax.swing.JButton btSaveData;
    private javax.swing.JButton btViewAllUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAdmName;
    // End of variables declaration//GEN-END:variables



}
