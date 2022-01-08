
public class adminHomePage extends javax.swing.JFrame {

    public adminHomePage() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        feeandattendence = new javax.swing.JLabel();
        viewdata = new javax.swing.JLabel();
        addnew1 = new javax.swing.JLabel();
        signout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        feeandattendence.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        feeandattendence.setForeground(new java.awt.Color(204, 204, 255));
        feeandattendence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feeandattendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/icons8-report-card-100 (1).png"))); // NOI18N
        feeandattendence.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        feeandattendence.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        feeandattendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feeandattendenceMouseClicked(evt);
            }
        });
        jPanel1.add(feeandattendence);
        feeandattendence.setBounds(120, 230, 110, 110);

        viewdata.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        viewdata.setForeground(new java.awt.Color(204, 204, 255));
        viewdata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/icons8-view-100.png"))); // NOI18N
        viewdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewdata.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdataMouseClicked(evt);
            }
        });
        jPanel1.add(viewdata);
        viewdata.setBounds(300, 70, 110, 110);

        addnew1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        addnew1.setForeground(new java.awt.Color(204, 204, 255));
        addnew1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addnew1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/icons8-add-100.png"))); // NOI18N
        addnew1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addnew1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addnew1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnew1MouseClicked(evt);
            }
        });
        jPanel1.add(addnew1);
        addnew1.setBounds(120, 70, 110, 110);

        signout.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        signout.setForeground(new java.awt.Color(204, 204, 255));
        signout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/icons8-sign-out-100.png"))); // NOI18N
        signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutMouseClicked(evt);
            }
        });
        jPanel1.add(signout);
        signout.setBounds(310, 230, 110, 110);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sign Out");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 340, 80, 26);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add New");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 180, 80, 26);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View & Update");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 180, 130, 26);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fee & Attendence");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 340, 160, 26);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Home", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 470, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/30.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-480, 0, 1220, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutMouseClicked
        loginpage lp = new loginpage();
        dispose();
        lp.setVisible(true);
    }//GEN-LAST:event_signoutMouseClicked

    private void feeandattendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feeandattendenceMouseClicked
      feeandattendence fa = new feeandattendence();
      dispose();
      fa.setVisible(true);
    }//GEN-LAST:event_feeandattendenceMouseClicked

    private void viewdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdataMouseClicked
       search s =new search();
       dispose();
       s.setVisible(true);
    }//GEN-LAST:event_viewdataMouseClicked

    private void addnew1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnew1MouseClicked
        Addnew an = new Addnew();
        dispose();
        an.setVisible(true);
    }//GEN-LAST:event_addnew1MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addnew1;
    private javax.swing.JLabel feeandattendence;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel signout;
    private javax.swing.JLabel viewdata;
    // End of variables declaration//GEN-END:variables
}
