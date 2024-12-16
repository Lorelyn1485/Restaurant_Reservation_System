
package restaurant_reservation._system;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FoodMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        TableReserve = new javax.swing.JButton();
        RoomReserve = new javax.swing.JToggleButton();
        FoodMenu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 235, 235));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/cute logo f.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 430, 400));

        FoodMenu.setBackground(new java.awt.Color(255, 204, 204));
        FoodMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FoodMenu.setText("Food Menu");
        FoodMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodMenuActionPerformed(evt);
            }
        });
        jPanel2.add(FoodMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 40));

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Welcome to Lorie 's Restaurant !!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 390, 60));

        jButton8.setBackground(new java.awt.Color(255, 204, 204));
        jButton8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton8.setText("Log out");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, -1));

        TableReserve.setBackground(new java.awt.Color(255, 204, 204));
        TableReserve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TableReserve.setText("Table Reservation");
        TableReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableReserveActionPerformed(evt);
            }
        });
        jPanel2.add(TableReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, 40));

        RoomReserve.setBackground(new java.awt.Color(255, 204, 204));
        RoomReserve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RoomReserve.setText("Rooms Reservation");
        RoomReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomReserveActionPerformed(evt);
            }
        });
        jPanel2.add(RoomReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 40));

        FoodMenu1.setBackground(new java.awt.Color(255, 204, 204));
        FoodMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FoodMenu1.setText("Order Info");
        FoodMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodMenu1ActionPerformed(evt);
            }
        });
        jPanel2.add(FoodMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 820, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/Pink Gradien 1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 604));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        LogIn LoginFrame = new LogIn();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void FoodMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodMenuActionPerformed
       FoodMenu FoodMenuFrame = new FoodMenu();
        FoodMenuFrame.setVisible(true);
        FoodMenuFrame.pack();
        FoodMenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_FoodMenuActionPerformed

    private void TableReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableReserveActionPerformed
        TableReservation  TableReservationFrame = new  TableReservation();
        TableReservationFrame.setVisible(true);
        TableReservationFrame.pack();
        TableReservationFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_TableReserveActionPerformed

    private void RoomReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomReserveActionPerformed
        Rooms RoomFrame = new Rooms();
        RoomFrame.setVisible(true);
        RoomFrame.pack();
        RoomFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RoomReserveActionPerformed

    private void FoodMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodMenu1ActionPerformed
        // TODO add your handling code here:
        Order_Info order = new Order_Info();
        order.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FoodMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    void setUser(String fname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FoodMenu;
    private javax.swing.JButton FoodMenu1;
    private javax.swing.JToggleButton RoomReserve;
    private javax.swing.JButton TableReserve;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
