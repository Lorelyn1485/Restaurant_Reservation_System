
package restaurant_reservation._system;


public class LoadingScreen extends javax.swing.JFrame {

    
    public LoadingScreen() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        PerCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/pics/Cute logo...700.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 620, 500));
        jPanel1.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 524, 610, 20));

        PerCount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PerCount.setText("%");
        jPanel1.add(PerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurant_reservation/_system/Pink Gradien 1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 950, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
       
        LoadingScreen lc = new LoadingScreen();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lc.setVisible(true);
            }
        });
        
        try{
         
           for(int i=0;i<=100;i++){
               Thread.sleep(50);
               lc.ProgressBar.setValue(i);
               lc.PerCount.setText(Integer.toString(i)+"%");
           }
    }catch (Exception e){
        }
        
        LogIn li = new LogIn();
        lc.setVisible(false);
        li.setVisible(true);
        lc.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PerCount;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void setValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
