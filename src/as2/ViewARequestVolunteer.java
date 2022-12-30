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
import javax.swing.JLayeredPane;

/**
 *
 * @author Hendry
 */
public class ViewARequestVolunteer extends javax.swing.JFrame {

    /**
     * Creates new form SchoolHelpGUI
     */
    
    SchoolHELP sHelp;
    int volunteerIndex;
    int requestIndex;
    public ViewARequestVolunteer(SchoolHELP sHelpIn, int volunteerIndexIn, int requestIndexIn) {
        sHelp = sHelpIn;
        volunteerIndex = volunteerIndexIn;
        requestIndex = requestIndexIn;
        initComponents();
        setInformationText();
 
        
        
        
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
        lbRequestId = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lpRequestPane = new javax.swing.JLayeredPane();
        panelResourceReq = new javax.swing.JPanel();
        lbReqType = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        lbResReq = new javax.swing.JLabel();
        lbNumReq = new javax.swing.JLabel();
        tfResourceRequired = new javax.swing.JTextField();
        tfNumRequired = new javax.swing.JTextField();
        tfRequestType = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        panelTutorReq = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfProposedDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfProposedTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfStudentLevel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfStudentNumbers = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        lbDesc1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescTutorial = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lbReqType1 = new javax.swing.JLabel();
        tfRequestType2 = new javax.swing.JTextField();
        btBack = new javax.swing.JButton();
        btSubmitOffer = new javax.swing.JButton();

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
        lbWelcome.setText("Viewing a Request");

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

        lbRequestId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbRequestId.setText("ID: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(lbWelcome)
                .addGap(109, 109, 109)
                .addComponent(lbRequestId)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWelcome)
                    .addComponent(lbRequestId))
                .addGap(22, 22, 22))
        );

        lpRequestPane.setMaximumSize(new java.awt.Dimension(480, 480));

        lbReqType.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbReqType.setText("Request Type");

        lbDesc.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDesc.setText("Description");

        lbResReq.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbResReq.setText("Resource Required");

        lbNumReq.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbNumReq.setText("Numbers Required");

        tfRequestType.setText("Resource Request");

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane1.setViewportView(taDescription);

        javax.swing.GroupLayout panelResourceReqLayout = new javax.swing.GroupLayout(panelResourceReq);
        panelResourceReq.setLayout(panelResourceReqLayout);
        panelResourceReqLayout.setHorizontalGroup(
            panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResourceReqLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResourceReqLayout.createSequentialGroup()
                        .addComponent(lbReqType)
                        .addGap(106, 106, 106)
                        .addComponent(tfRequestType))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResourceReqLayout.createSequentialGroup()
                        .addComponent(lbResReq)
                        .addGap(72, 72, 72)
                        .addComponent(tfResourceRequired))
                    .addGroup(panelResourceReqLayout.createSequentialGroup()
                        .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumReq)
                            .addComponent(lbDesc))
                        .addGap(77, 77, 77)
                        .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumRequired)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addGap(65, 65, 65))
        );
        panelResourceReqLayout.setVerticalGroup(
            panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResourceReqLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReqType)
                    .addComponent(tfRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResReq)
                    .addComponent(tfResourceRequired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumReq)
                    .addComponent(tfNumRequired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelResourceReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Proposed Date");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Proposed Time");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(tfProposedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfProposedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfProposedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfProposedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Student Level");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Student Numbers");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfStudentNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(tfStudentLevel))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfStudentLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfStudentNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbDesc1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbDesc1.setText("Description");

        taDescTutorial.setColumns(20);
        taDescTutorial.setRows(5);
        jScrollPane2.setViewportView(taDescTutorial);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lbDesc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lbDesc1)
                        .addGap(43, 43, 43)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbReqType1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lbReqType1.setText("Request Type");

        tfRequestType2.setText("TutorialRequest");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lbReqType1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRequestType2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRequestType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReqType1))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout panelTutorReqLayout = new javax.swing.GroupLayout(panelTutorReq);
        panelTutorReq.setLayout(panelTutorReqLayout);
        panelTutorReqLayout.setHorizontalGroup(
            panelTutorReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTutorReqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTutorReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTutorReqLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTutorReqLayout.setVerticalGroup(
            panelTutorReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTutorReqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTutorReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lpRequestPane.setLayer(panelResourceReq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpRequestPane.setLayer(panelTutorReq, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpRequestPaneLayout = new javax.swing.GroupLayout(lpRequestPane);
        lpRequestPane.setLayout(lpRequestPaneLayout);
        lpRequestPaneLayout.setHorizontalGroup(
            lpRequestPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpRequestPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelResourceReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(lpRequestPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lpRequestPaneLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(panelTutorReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        lpRequestPaneLayout.setVerticalGroup(
            lpRequestPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResourceReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(lpRequestPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lpRequestPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTutorReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpRequestPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpRequestPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btSubmitOffer.setText("Submit an Offer");
        btSubmitOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitOfferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpAdminRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSubmitOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(helpAdminRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubmitOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        ViewRequestVolunteerPage volReq = new ViewRequestVolunteerPage(sHelp, volunteerIndex);
        volReq.setVisible(true);
        dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btSubmitOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitOfferActionPerformed
        OfferPage subOffer = new OfferPage(sHelp, volunteerIndex, requestIndex);
        subOffer.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btSubmitOfferActionPerformed
  
    private void setInformationText(){
        Request currentRequest = sHelp.getRequestByIndex(requestIndex);
        if(sHelp.findRequestType(currentRequest).equalsIgnoreCase("Tutorial Request")){
            //tutorial request
            TutorialRequest currentTutReq = (TutorialRequest) currentRequest;
            taDescTutorial.setText(currentRequest.getDescription());
            tfProposedDate.setText(currentTutReq.getProposedDate());
            tfProposedTime.setText(currentTutReq.getProposedTime());
            tfStudentLevel.setText(currentTutReq.getStudentLevel());
            tfStudentNumbers.setText(String.valueOf(currentTutReq.getNumStudents()));
            panelTutorReq.setVisible(true);
            panelResourceReq.setVisible(false);
                     
        }
        else{
            //resource request
            ResourceRequest currentResRequest = (ResourceRequest) currentRequest;
            taDescription.setText(currentRequest.getDescription());
            tfNumRequired.setText(String.valueOf(currentResRequest.getNumRequired()));
            tfResourceRequired.setText(currentResRequest.getResourceType());
            panelTutorReq.setVisible(false);
            panelResourceReq.setVisible(true);
        }
        
        lbRequestId.setText("ID:" + currentRequest.getRequestID());
        
        taDescTutorial.setEditable(false);
        taDescription.setEditable(false);
        tfNumRequired.setEditable(false);
        tfProposedDate.setEditable(false);
        tfProposedTime.setEditable(false);
        tfRequestType.setEditable(false);
        tfRequestType2.setEditable(false);
        tfResourceRequired.setEditable(false);
        tfStudentLevel.setEditable(false);
        tfStudentNumbers.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSubmitOffer;
    private javax.swing.JDialog firstTimeSetupDialog;
    private javax.swing.JPanel firstTimeSetupDialogPanel;
    private javax.swing.JPanel helpAdminRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbDesc1;
    private javax.swing.JLabel lbNumReq;
    private javax.swing.JLabel lbReqType;
    private javax.swing.JLabel lbReqType1;
    private javax.swing.JLabel lbRequestId;
    private javax.swing.JLabel lbResReq;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JLayeredPane lpRequestPane;
    private javax.swing.JPanel panelResourceReq;
    private javax.swing.JPanel panelTutorReq;
    private javax.swing.JButton setupConfirmButton;
    private javax.swing.JTextArea taDescTutorial;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JTextField tfNumRequired;
    private javax.swing.JTextField tfProposedDate;
    private javax.swing.JTextField tfProposedTime;
    private javax.swing.JTextField tfRequestType;
    private javax.swing.JTextField tfRequestType2;
    private javax.swing.JTextField tfResourceRequired;
    private javax.swing.JTextField tfStudentLevel;
    private javax.swing.JTextField tfStudentNumbers;
    // End of variables declaration//GEN-END:variables
}
