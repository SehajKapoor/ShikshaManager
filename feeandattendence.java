
public class feeandattendence extends javax.swing.JFrame {

    public feeandattendence() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        help = new javax.swing.JLabel();
        viewdata = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        help.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        help.setForeground(new java.awt.Color(204, 204, 255));
        help.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/icons8-test-passed-100.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jPanel1.add(help);
        help.setBounds(300, 90, 110, 110);

        viewdata.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        viewdata.setForeground(new java.awt.Color(204, 204, 255));
        viewdata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/icons8-report-card-100 (1).png"))); // NOI18N
        viewdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewdata.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdataMouseClicked(evt);
            }
        });
        jPanel1.add(viewdata);
        viewdata.setBounds(110, 90, 110, 110);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fee");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 200, 40, 26);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Attendence");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 200, 100, 26);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b15.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 260, 114, 40);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Fee & Attendence", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 450, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/32.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-270, -20, 790, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        Studentattendence sa = new Studentattendence();
        dispose();
        sa.setVisible(true);
    }//GEN-LAST:event_helpMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        adminHomePage ahp = new adminHomePage();
        dispose();
        ahp.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void viewdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdataMouseClicked
        Feedetail obj = new Feedetail();
        dispose();
        obj.setVisible(true);

    }//GEN-LAST:event_viewdataMouseClicked

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
            java.util.logging.Logger.getLogger(feeandattendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feeandattendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feeandattendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feeandattendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feeandattendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel viewdata;
    // End of variables declaration//GEN-END:variables
}
