
package restaurant_reservation._system;



import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LogIn extends javax.swing.JFrame {

     
  PreparedStatement pst;
  ResultSet rs;
  Connection con;
    public LogIn() {
        initComponents();
        con = dbconnect.getConnected();
        showCurrentDate();
        
    }

    private void showCurrentDate() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = currentDate.format(formatter);

        // Update the JLabel with the formatted date
        time.setText(formattedDate);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 260, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 192, 80, -1));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 231, 330, 44));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 330, 47));

        jCheckBox1.setText("show password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 102, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/Cute 1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 110));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("LOG IN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, 40));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("WELCOME !");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 40));

        time.setText("Time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Restaurant Reservation ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 250, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/Pink Gradien.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 460, 630));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/2.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            pass.setEchoChar((char)0);
        }else{
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String getUname = uname.getText();
        String getPass = pass.getText();
        
        try{
            if(getUname.isEmpty() || getPass.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Complete the fields!", "Error", HEIGHT);
                return;
            }
            else{
                String query = "SELECT * FROM `staff` WHERE `Username`=? && `Password`=?";
                pst = con.prepareStatement(query);
                pst.setString(1, getUname);
                pst.setString(2, getPass);
                rs = pst.executeQuery();
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(rootPane, "Access Granted!");
                    String getTime = time.getText();
                    
                    try{
                        pst = con.prepareStatement("UPDATE `staff` SET `JobStarted`=? WHERE `Username`=?");
                        pst.setString(1, getTime);
                        pst.setString(2, getUname);
                        int rowaffected = pst.executeUpdate();
                        if(rowaffected ==1){
                            uname.setText("");
                            pass.setText("");
                            Home h = new Home();
                            h.setVisible(true);
                            this.dispose();
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Access Denied! Invalid Credentials!", "Error", HEIGHT);
                }
            }
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel time;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

  

}