
package restaurant_reservation._system;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;


public class Staff extends javax.swing.JFrame {
    
   Connection con = null;
    Statement st = null;
    PreparedStatement pst= null;
    ResultSet rs = null;
    DefaultTableModel tblmodel = null;

    String idSelectedTableIndex = "";
    public Staff() {
        initComponents();
         con = dbconnect.getConnected();
        loadProducts();
    }
    
    public final void loadProducts() {
        try {
            tblmodel = (DefaultTableModel) stafftable.getModel();
            tblmodel.setRowCount(0);
            pst = con.prepareStatement("SELECT * FROM `staff`");
            rs = pst.executeQuery();

            while (rs.next()) {
                tblmodel.addRow(new Object[]{
                    rs.getString("Name"),
                    rs.getString("Position"),
                    rs.getString("Phone"),
                    rs.getString("Section"),
                    rs.getString("ID"),
                    rs.getString("Address"),
                    rs.getString("Age"),
                    rs.getString("JobStarted"),
                   // rs.getString(idSelectedTableIndex),
                    });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        sphone = new javax.swing.JTextField();
        sposition = new javax.swing.JTextField();
        ssection = new javax.swing.JTextField();
        saddress = new javax.swing.JTextField();
        sage = new javax.swing.JTextField();
        sdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        stafftable = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/Cute 250.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, 200, 170));

        jPanel2.setBackground(new java.awt.Color(255, 225, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Name :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Phone Number:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Position :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Section :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Address :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Age :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Job Started Date :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel2.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 240, -1));
        jPanel2.add(sphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, -1));
        jPanel2.add(sposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, -1));
        jPanel2.add(ssection, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 230, -1));
        jPanel2.add(saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 230, -1));
        jPanel2.add(sage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 230, -1));
        jPanel2.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, 340));

        stafftable.setBackground(new java.awt.Color(253, 236, 236));
        stafftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Position", "Phone", "Section", "ID", "Address", "Age", "JobStarted"
            }
        ));
        stafftable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stafftableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stafftable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 610, 370));

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 110, 30));

        insert.setBackground(new java.awt.Color(255, 204, 204));
        insert.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 110, 30));

        update.setBackground(new java.awt.Color(255, 204, 204));
        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 110, 30));

        delete.setBackground(new java.awt.Color(255, 204, 204));
        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 110, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 60, 10));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 210, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Staff");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 80, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 80, -1));

        jButton9.setBackground(new java.awt.Color(255, 204, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("EXIT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/Pink Gradien 1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 604));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home HomeFrame = new Home();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
     
      String Name, Position, Phone, Section, Address, Age, JobStarted;
        
        int message = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to add Information?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            try {
                
                  Name = sname.getText();
                  Position =sposition.getText();
                  Phone= sphone.getText();
                  Section= ssection.getText();
                  Address= saddress.getText();
                  Age= sage.getText();
                  JobStarted= sdate.getDate().toString();
                
                 if(Name.isEmpty() || Position.isEmpty() || Phone.isEmpty() || Section.isEmpty()  || Address.isEmpty()  || Age.isEmpty()  
                         || JobStarted.isEmpty()){
           JOptionPane.showMessageDialog(rootPane, "Complete the the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }  

            
                   if(message == JOptionPane.YES_NO_OPTION){
                   
                pst =con.prepareStatement ( "INSERT INTO staff (Name, Position,Phone,Section,ID,Address, Age, JobStarted) VALUES (?,?,?,?, null ,?,?,?)");
               
                pst.setString(1, Name);
                pst.setString(2, Position);
                pst.setString(3,Phone);
                pst.setString(4,Section);      
                pst.setString(5,Address);
                pst.setString(6,Age);
                pst.setString(7,JobStarted);
               
                 int isAdded = pst.executeUpdate();
                 if (isAdded ==1) {
                    JOptionPane.showMessageDialog(this, "Added successfully");
                      loadProducts();
                      
                   sname.setText("");
                   sposition.setText("");
                   sphone.setText("");
                   ssection.setText("");
                   saddress.setText("");
                   sage.setText("");
                   sdate.getDate().toString();
                    showMessageDialog(null, "New info has been Added successfully!");
                          } else {
                              JOptionPane.showMessageDialog(null,"Unable to Add ");
                }
                   }    
             
            } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           System.out.println("Error!" + e.getMessage());
           
           
           
    }               
                     
    }//GEN-LAST:event_insertActionPerformed
     
       
    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         if (update.getText().equals("SAVE")) {
             String Name = sname.getText();
             String Position = sposition.getText();
             String  Phone= sphone.getText();
             String  Section= ssection.getText();
             String  Address= saddress.getText();
             String  Age= sage.getText();
             String  JobStarted= sdate.getDate().toString();
             
              try {
                 pst =con.prepareStatement ( "UPDATE `staff` SET `Name`= ?,`Position`= ?,`Phone`= ?,`Section`= ?,`Address`= ?,`Age`= ?,`JobStarted`= ? WHERE `ID` = ?");
               
                pst.setString(1, Name);
                pst.setString(2, Position);
                pst.setString(3,Phone);
                pst.setString(4,Section);
                pst.setString(7, idSelectedTableIndex);
                pst.setString(5,Address);
                pst.setString(6,Age);
                pst.setString(7,JobStarted);
                
                int isAdded = pst.executeUpdate();
                if (isAdded == 1) {
                    JOptionPane.showMessageDialog(null, "Item updated");
                    loadProducts();
                    
                    
                   sname.setText("");
                   sposition.setText("");
                   sphone.setText("");
                   ssection.setText("");
                   saddress.setText("");
                   sage.setText("");
                // sid.setText("");
                   sdate.getDate().toString();
                   
                  } else {
                    JOptionPane.showMessageDialog(null, "Theres an error");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
//            Update.setText("EDIT");
//        } else {
//            Update.setText("SAVE");
         }
    }//GEN-LAST:event_updateActionPerformed

    private void stafftableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stafftableMouseClicked
        update.setText("SAVE");
        idSelectedTableIndex = tblmodel.getValueAt(stafftable.getSelectedRow(), 4).toString();
        sname.setText(tblmodel.getValueAt(stafftable.getSelectedRow(), 0).toString());
        sposition.setText(tblmodel.getValueAt(stafftable.getSelectedRow(), 1).toString());
        sphone.setText(tblmodel.getValueAt(stafftable.getSelectedRow(), 2).toString());
        ssection.setText(tblmodel.getValueAt(stafftable.getSelectedRow(), 3).toString());  
        saddress.setText(tblmodel.getValueAt(stafftable.getSelectedRow(), 5).toString());  
        sage.setText(tblmodel.getValueAt(stafftable.getSelectedRow(), 6).toString());  
    }//GEN-LAST:event_stafftableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      try {
                 pst= con.prepareStatement("DELETE FROM `staff` WHERE `ID` = " + idSelectedTableIndex +"");
                int isAdded = pst.executeUpdate();
                if (isAdded == 1) {
                    JOptionPane.showMessageDialog(null, "Item deleted");
                    loadProducts();            
                    
                   sname.setText("");
                   sposition.setText("");
                   sphone.setText("");
                   ssection.setText("");
                   saddress.setText("");
                   sage.setText("");
                // sid.setText("");
                   sdate.getDate().toString();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Theres an error");
                }
           
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField saddress;
    private javax.swing.JTextField sage;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sphone;
    private javax.swing.JTextField sposition;
    private javax.swing.JTextField ssection;
    private javax.swing.JTable stafftable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
