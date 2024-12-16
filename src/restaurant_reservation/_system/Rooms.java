
package restaurant_reservation._system;



import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;

public class Rooms extends javax.swing.JFrame {


    
    Connection con = null;
    Statement st = null;
    PreparedStatement query = null;
    ResultSet rs = null;
    DefaultTableModel tblmodel = null;

    String idSelectedTableIndex = "";
    
    public Rooms() {
        initComponents();
        con = dbconnect.getConnected();
        loadProducts();
        
    }
    
     public final void loadProducts() {
        try {
            tblmodel = (DefaultTableModel) rtable.getModel();
            tblmodel.setRowCount(0);
            query = con.prepareStatement("SELECT * FROM `rooms`");
            rs = query.executeQuery();

            while (rs.next()) {
                tblmodel.addRow(new Object[]{
                    rs.getString("Name"),
                    rs.getString("Phone"),
                    rs.getString("Address"),
                    rs.getString("Room"),
                    rs.getString("Date"),
                    rs.getString("Time"),
                    rs.getString("Availability"),
                     rs.getString("ID"),
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rname = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        raddress = new javax.swing.JTextField();
        roomname = new javax.swing.JTextField();
        rphone = new javax.swing.JTextField();
        cbroom = new javax.swing.JComboBox<>();
        cbavail = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rtable = new javax.swing.JTable();
        Clear = new javax.swing.JButton();
        Book = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/cute logo f 250.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 220, 190));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText(" Room");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 210, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Reservation");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 190, 40));

        rname.setBackground(new java.awt.Color(253, 223, 223));
        rname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rname.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Name : ");
        rname.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 62, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Availability : ");
        rname.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Room Number :");
        rname.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Phone Number :");
        rname.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Address :");
        rname.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Date :");
        rname.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, -1));

        raddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raddressActionPerformed(evt);
            }
        });
        rname.add(raddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 220, -1));

        roomname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnameActionPerformed(evt);
            }
        });
        rname.add(roomname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, -1));

        rphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rphoneActionPerformed(evt);
            }
        });
        rname.add(rphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, -1));

        cbroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Select ~", "Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6" }));
        rname.add(cbroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, -1));

        cbavail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Select~", "BOOK", "AVAIL", " " }));
        cbavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbavailActionPerformed(evt);
            }
        });
        rname.add(cbavail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, -1));
        rname.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Time:");
        rname.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        rname.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 220, -1));

        jPanel1.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, 320));

        rtable.setBackground(new java.awt.Color(255, 238, 238));
        rtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name ", "Phone", "Address", "Room", "Date", "Time", "Availability", "ID"
            }
        ));
        rtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 600, 380));

        Clear.setBackground(new java.awt.Color(255, 204, 204));
        Clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 110, 30));

        Book.setBackground(new java.awt.Color(255, 204, 204));
        Book.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Book.setText("BOOK");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        jPanel1.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 110, 30));

        Update.setBackground(new java.awt.Color(255, 204, 204));
        Update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 110, 30));

        Delete.setBackground(new java.awt.Color(255, 204, 204));
        Delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 110, 30));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 80, -1));

        jButton10.setBackground(new java.awt.Color(255, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 80, -1));

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

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
          try {
                 query= con.prepareStatement("DELETE FROM `rooms` WHERE `ID` = " + idSelectedTableIndex +"");
                int isAdded = query.executeUpdate();
                if (isAdded == 1) {
                    JOptionPane.showMessageDialog(null, "Item deleted");
                    loadProducts();                      
                roomname.setText("");
                rphone.setText("");
                raddress.setText("");
                cbroom.setSelectedItem("");
                date.getText();
                cbavail.setSelectedItem("");
                time.setText("");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Theres an error");
                }
           
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_DeleteActionPerformed

    private void raddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raddressActionPerformed

    private void roomnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnameActionPerformed

    private void rphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Home HomeFrame = new Home();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        String Name, Phone, Address, Room , Date , Availability, Time;
        
         try {          
           
                Name = roomname.getText();
                Phone = rphone.getText();
                Address = raddress.getText();
                Room = cbroom.getSelectedItem().toString();
                Date = date.getText();
                Time = time.getText();
                Availability= cbavail.getSelectedItem().toString();
              
               query = con.prepareStatement("INSERT INTO `rooms`(`Name`, `Phone`, `Address`, `Room`, `Date`, `Time`, `Availability`, `ID`) VALUES(?,?,?,?,?,?,?,null)");
             
               
                       query.setString(1, Name);
                       query.setString(2, Phone);
                       query.setString(3, Address);
                       query.setString(4, Room);
                       query.setString(5, Date);
                       query.setString(6, Time);
                       query.setString(7, Availability);
                       //query.setString(4, idSelectedTableIndex);
                          
                          int isAdded = query.executeUpdate();
                          if (isAdded == 1) {
                              JOptionPane.showMessageDialog(null,"Item Added");
                              loadProducts();
                              
                roomname.setText("");
                rphone.setText("");
                raddress.setText("");
                cbroom.setSelectedItem("");
                date.setText("");
                time.setText("");
                cbavail.setSelectedItem("");
                showMessageDialog(null, "New info has been created successfully!");
                          } else {
                              JOptionPane.showMessageDialog(null,"Unable to Add ");
                          }
                          
               }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           System.out.println("Error!" + e.getMessage());
        }
                                  
    }//GEN-LAST:event_BookActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
         if (Update.getText().equals("SAVE")) {
             String Name = roomname.getText();
             String Phone = rphone.getText();
             String Address = raddress.getText();
             String Room = cbroom.getSelectedItem().toString();
             String Date = date.getText();
             String Availability= cbavail.getSelectedItem().toString();
             String getTime = time.getText();
        
            
           

            try {
                query = con.prepareStatement("UPDATE `rooms` SET `Name`= ?,`Phone`= ?,`Address`= ?,`Room`= ?,`Date`= ?, `Time`=?, `Availability`= ? WHERE `ID` = ?");
                query.setString(1, Name);
                query.setString(2, Phone);
                query.setString(3, Address);
                query.setString(4, Room);
                query.setString(5, Date);
                query.setString(6, getTime);
                query.setString(7, Availability);
                query.setString(8, idSelectedTableIndex);

                int isAdded = query.executeUpdate();
                if (isAdded == 1) {
                    JOptionPane.showMessageDialog(null, "Item updated");
                    loadProducts();
                    roomname.setText("");
                    rphone.setText("");
                    raddress.setText("");
                    cbroom.setSelectedItem("");
                    date.setText("");
                    cbavail.setSelectedItem("");
                    time.setText("");
                     
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
    }//GEN-LAST:event_UpdateActionPerformed

    private void rtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rtableMouseClicked
        Update.setText("SAVE");
        idSelectedTableIndex = tblmodel.getValueAt(rtable.getSelectedRow(), 7).toString();
        roomname.setText(tblmodel.getValueAt(rtable.getSelectedRow(), 0).toString());
        rphone.setText(tblmodel.getValueAt(rtable.getSelectedRow(), 1).toString());
        raddress.setText(tblmodel.getValueAt(rtable.getSelectedRow(), 2).toString());  
        cbroom.setSelectedItem(tblmodel.getValueAt(rtable.getSelectedRow(), 3).toString());  
        date.setText(tblmodel.getValueAt(rtable.getSelectedRow(), 4).toString());
 //       rdate.getDate().toString(tblmodel.getValueAt(rtable.getSelectedRow(), 4).toString());  
        cbavail.setSelectedItem(tblmodel.getValueAt(rtable.getSelectedRow(), 6).toString());  
        time.setText(tblmodel.getValueAt(rtable.getSelectedRow(), 5).toString());
               
    }//GEN-LAST:event_rtableMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        roomname.setText("");
                rphone.setText("");
                raddress.setText("");
                cbroom.setSelectedItem("");
                date.setText("");
                cbavail.setSelectedItem("");

    }//GEN-LAST:event_ClearActionPerformed

    private void cbavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbavailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbavailActionPerformed

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
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox<String> cbavail;
    private javax.swing.JComboBox<String> cbroom;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField raddress;
    private javax.swing.JPanel rname;
    private javax.swing.JTextField roomname;
    private javax.swing.JTextField rphone;
    private javax.swing.JTable rtable;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
