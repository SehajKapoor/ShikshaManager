
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewStudentData extends javax.swing.JFrame {

    
    
    String className1=null;
    String sectionName1=null;
     ArrayList<SDMS> list=null;
   static  String regd="";
   
    public ViewStudentData() {
        initComponents();
        
        
        
        className1=search.className;
        sectionName1=search.sectionName;
        System.out.println(""+className1+"   "+sectionName1);
        
        showDataInTable();
    }

    ArrayList<SDMS> getData()
    {
        ArrayList< SDMS> listt=new ArrayList<>();
        
        
        
             try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        
            String query="Select * from studentregistration where Class=? and Sec=? ";
            
            PreparedStatement psmt=con.prepareStatement(query);
            
            psmt.setString(1, className1);
            psmt.setString(2, sectionName1);
            
            ResultSet rs=psmt.executeQuery();
            
            while(rs.next())
            {
                String a=rs.getString("Regdno");
                String b=rs.getString("Name");
                 String c=rs.getString("Fname");
                  String d=rs.getString("Foccupation");
                   String e=rs.getString("Class");
                    String f=rs.getString("Sec");
                     String g=rs.getString("DOB");
                      String h=rs.getString("Aadhaar");
                      
                
                
                SDMS obj=new SDMS(a,b,c,d,e,f,g,h);
                
                listt.add(obj);
                
            }
            
            
            
            
            
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewStudentData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudentData.class.getName()).log(Level.SEVERE, null, ex);
        }
             
       
             return listt;
        
    }
    
    
    
    void showDataInTable()
    {
        list=getData();
        
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        
        Object ob[] =new Object[8];
        
        for(int i=0;i<list.size();i++)
        {
            ob[0]=list.get(i).getRegd_no();
            ob[1]=list.get(i).getStudent_Name();
            ob[2]=list.get(i).getFather_Name();
            ob[3]=list.get(i).getFather_occupation();
            ob[4]=list.get(i).getClassName();
            ob[5]=list.get(i).getSection();
            ob[6]=list.get(i).getDOB();
            ob[7]=list.get(i).getAadhaar_no();
            
            
            
            model.addRow(ob);
        }
        
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Regd no.", "Student Name", "Father Name", "Father Occupation", "Class", "Section ", "DOB", "Aadhaar no"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 80, 880, 380);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b14.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(410, 480, 120, 40);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b17 (1).png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(560, 480, 120, 40);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b10.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16);
        jLabel16.setBounds(250, 480, 124, 40);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 920, 520);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/30.jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, -50, 1490, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        viewpage s = new viewpage();
        dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        search s=new search();
        dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int index=jTable1.getSelectedRow();
        
         regd=list.get(index).getRegd_no();
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        
      
try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        
            String query="Delete from studentregistration where regdno=? ";
            
            PreparedStatement psmt=con.prepareStatement(query);
            psmt.setString(1,regd);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data Deleted Successfully");
            ViewStudentData obj = new ViewStudentData();
            dispose();
            obj.setVisible(true);
}       catch (SQLException ex) {
    System.out.println(""+ex);
        } catch (ClassNotFoundException ex) {
           System.out.println(""+ex);
        }
                   
    }//GEN-LAST:event_jLabel16MouseClicked

 
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
            java.util.logging.Logger.getLogger(ViewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
