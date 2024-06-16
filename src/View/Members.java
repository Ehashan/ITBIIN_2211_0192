/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DeleteController;
import Controller.InsertController;
import Controller.UpdateController;
import Model.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import Model.DBSearch;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nuwar
 */
public class Members extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    public Members() {
        initComponents();
        
        memberTable();
    }

    
    Statement stmt;
    ResultSet rs;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        memberid = new javax.swing.JTextField();
        d = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        admem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        memiD = new javax.swing.JTextField();
        MaleRdo = new javax.swing.JLabel();
        maleRdo = new javax.swing.JRadioButton();
        femaleRdo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        memna = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        memID = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton3.setText("Add Books");

        memberid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberidActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        d.setBackground(new java.awt.Color(254, 255, 236));
        d.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 125, 41));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Members");
        d.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 189, 60));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Member Name:");
        d.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 185, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Contact Number:");
        d.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 223, -1, -1));

        conNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conNoActionPerformed(evt);
            }
        });
        d.add(conNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 223, 171, 24));

        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        d.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, 30));

        delete.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        d.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 100, 30));

        admem.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        admem.setText("Add Member");
        admem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admemActionPerformed(evt);
            }
        });
        d.add(admem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, -1));

        memTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Member_ID", "Member_Name", "Contact_No", "Gender", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        memTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memTableMouseClicked(evt);
            }
        });
        memTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                memTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                memTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(memTable);

        d.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 123, -1, 220));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Member ID:");
        d.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 152, -1, -1));

        memiD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memiDActionPerformed(evt);
            }
        });
        d.add(memiD, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 153, 171, 26));

        MaleRdo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        MaleRdo.setText("Gender:");
        d.add(MaleRdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 290, 79, -1));

        buttonGroup1.add(maleRdo);
        maleRdo.setText("Male");
        maleRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRdoActionPerformed(evt);
            }
        });
        d.add(maleRdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 294, 98, -1));

        buttonGroup1.add(femaleRdo);
        femaleRdo.setText("Female");
        femaleRdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRdoActionPerformed(evt);
            }
        });
        d.add(femaleRdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 294, 98, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("Address:");
        d.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 258, -1, -1));

        addressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFActionPerformed(evt);
            }
        });
        d.add(addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 260, 171, 24));

        memna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memnaActionPerformed(evt);
            }
        });
        d.add(memna, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 186, 171, 25));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        d.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 125, 41));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        d.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 910, -1));

        search.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        search.setText("Member ID:");
        d.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 13, -1, -1));

        memID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memIDActionPerformed(evt);
            }
        });
        d.add(memID, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 14, 171, 26));

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        d.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 52, -1, -1));

        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        d.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 70, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addmember.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        d.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conNoActionPerformed

    private void addressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTFActionPerformed

    private void admemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admemActionPerformed


        String addmember = memiD.getText();
        String memname = memna.getText();
        String contacNO = conNo.getText();
        String ADres = addressTF.getText();
        String gender;
        
        if (maleRdo.isSelected()){
            gender = "Male";
            
            InsertController.Form(addmember, memname, contacNO, ADres, gender);
        }
        
        if (femaleRdo.isSelected()){
            gender = "Female";
            
            InsertController.Form(addmember, memname, contacNO, ADres, gender);
        }
        

        memberTable();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_admemActionPerformed

    private void memberidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberidActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_memberidActionPerformed

    private void memiDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memiDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memiDActionPerformed

    private void femaleRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRdoActionPerformed

    private void maleRdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRdoActionPerformed

    private void memnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memnaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 Menu q = new Menu();
            this.hide();
            q.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void memIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memIDActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        String memid = memID.getText();
        
        try {
            
           stmt = DBConnection.getStatementConnection();
           rs = new DBSearch().searchMember(memid);
           
           while(rs.next()){
           
           String memID = rs.getString("Member_ID");
           String memName = rs.getString("Member_Name");
           String cName = rs.getString("Contact_Number");
           String address = rs.getString("Address");
           String gender = rs.getString("Gender");
           
           
           memiD.setText(memID);
           memna.setText(memName);
           conNo.setText(cName);
           addressTF.setText(address);
           
           if(gender.equals("Male")){
           
           maleRdo.setSelected(true);
           
           }
           if(gender.equals("Female")){
               
               femaleRdo.setSelected(true);
               
           }
           
           
           }
           
            
            
        } catch (Exception e) {
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    
    
    public void memberTable(){
    
    
        try {
            
            ResultSet rs = new DBSearch().searchAllMembers();
            
            DefaultTableModel tbModel = (DefaultTableModel)memTable.getModel();
            
             tbModel.setRowCount(0);
            
             while(rs.next()){
             
             
              String memID = rs.getString("Member_ID");
              String memname = rs.getString("Member_Name");
             String cont = rs.getString("Contact_Number");
             String adres = rs.getString("Address");
             String gender = rs.getString("Gender");
             String tbData[] = {memID,memname,cont,gender,adres};
          
          tbModel.addRow(tbData);
          
             
             }
            
            
        } catch (Exception e) {
        }
    
    
    
    }
    
    public void memLoad(){
        
        int r = memTable.getSelectedRow();
        
        String memID = memTable.getValueAt(r,0).toString();
        String meName = memTable.getValueAt(r, 1).toString();
        String fac = memTable.getValueAt(r, 2).toString();
        String gender =memTable.getValueAt(r, 3).toString();
        String lecid = memTable.getValueAt(r, 4).toString();
        
        memiD.setText(memID);
        memna.setText(meName);
        conNo.setText(fac);
        addressTF.setText(lecid);
        
        if(gender.equals("Male")){
            
            maleRdo.setSelected(true);
            
        }
        if(gender.equals("Female")){
            
            femaleRdo.setSelected(true);
            
        }
        
        
    }
    
    
    
    
    private void memTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memTableKeyPressed
memLoad();

        // TODO add your handling code here:
    }//GEN-LAST:event_memTableKeyPressed

    private void memTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memTableMouseClicked
memLoad();

        // TODO add your handling code here:
    }//GEN-LAST:event_memTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

String memID = memiD.getText();
String memname = memna.getText();
String cName = conNo.getText();
String address = addressTF.getText();
String gender;

if(maleRdo.isSelected()){
    gender = "Male";
    
    UpdateController.updateMember(memID,memname,cName,address,gender);
    System.out.println(memID+" "+memname+" "+cName+" "+ address+" "+gender);
}
if(femaleRdo.isSelected()){
    
    gender = "Female";
    
    UpdateController.updateMember(memID, memname, cName, address, gender);
    
}



        memberTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        
        String memID = memiD.getText();
        
        DeleteController.deleteMember(memID);



        memberTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void memTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memTableKeyReleased

memLoad();
        // TODO add your handling code here:
    }//GEN-LAST:event_memTableKeyReleased

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    
    public void clear(){
        
        memiD.setText("");
        memna.setText("");
        conNo.setText("");
        addressTF.setText("");
        
        maleRdo.setSelected(false);
        femaleRdo.setSelected(false);
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaleRdo;
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton admem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField conNo;
    private javax.swing.JPanel d;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton femaleRdo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRdo;
    private javax.swing.JTextField memID;
    private javax.swing.JTable memTable;
    private javax.swing.JTextField memberid;
    private javax.swing.JTextField memiD;
    private javax.swing.JTextField memna;
    private javax.swing.JLabel search;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
