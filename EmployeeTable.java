

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


public class EmployeeTable extends javax.swing.JFrame {
 
    String Designation1=null;
    
    static String adharrNumber=null;
    
     ArrayList<VED> list=null;
   
    public EmployeeTable() {
        initComponents();
        
         Designation1=search.designation1;
   System.out.println(""+Designation1);
    
    
        showDataInTable();
    }

  
        
    

    ArrayList<VED> getData()
    {
        ArrayList<VED> list=new ArrayList<>();
        
        
        
             try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        
            String query="Select * from employeeregistration where Designation=?";
            
            PreparedStatement psmt=con.prepareStatement(query);
            
            psmt.setString(1,Designation1);
           
            
            ResultSet rs=psmt.executeQuery();
            
            while(rs.next())
            {
               String a=rs.getString("Aadhaar");
               String b=rs.getString("DOB");
                  String c=rs.getString("Name");
                  String d=rs.getString("FHname");
                   String e=rs.getString("Gender");
                    String f=rs.getString("Category");
                   String g=rs.getString("Email");
                      String h=rs.getString("contact");
                      String i=rs.getString("Address");
                      String j=rs.getString("Salary");
                      String k=rs.getString("Qualification");
                    String l=rs.getString("Designation");
                     String m=rs.getString("Keystrengths");
                   
                   
                
                
                VED obj=new VED(a,b,c,d,e,f,g,h,i,j,k,l,m);
                
                list.add(obj);
                
            }
            
            
            
            
            
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewStudentData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewStudentData.class.getName()).log(Level.SEVERE, null, ex);
        }
             
       
             return list;
        
    }
    
    
    
    void showDataInTable()
    {
       list=getData();
        
        DefaultTableModel model=(DefaultTableModel) jTable3.getModel();
        
        Object ob[] =new Object[6];
        
        for(int i=0;i<list.size();i++)
        {
            ob[0]=list.get(i).getAadhaar_no();
            ob[1]=list.get(i).getEmployee_Name();
            ob[2]=list.get(i).getFH_Name();
            ob[3]=list.get(i).getDOB();
            ob[4]=list.get(i).getDesignation();
            ob[5]=list.get(i).getSalary();
          
      
            model.addRow(ob);
        }
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aadhaar", "Employee Name", "Father/Husband Name", "D.O.B.", "Designation", "Salary "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable3);

        jScrollPane5.setViewportView(jScrollPane6);

        jPanel3.add(jScrollPane5);
        jScrollPane5.setBounds(40, 70, 880, 380);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b17 (1).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11);
        jLabel11.setBounds(550, 480, 120, 40);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b14.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12);
        jLabel12.setBounds(410, 480, 120, 40);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b10.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16);
        jLabel16.setBounds(250, 480, 124, 40);

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Employees", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 20, 920, 520);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/30.jpg"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(-10, -50, 1490, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        search s = new search();
        dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        vieemployeedata s = new vieemployeedata();
        dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
       int index=jTable3.getSelectedRow();
        
        adharrNumber=list.get(index).getAadhaar_no();
    }//GEN-LAST:event_jTable3MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");

            String query="Delete from employeeregistration where Aadhaar=? ";

            PreparedStatement psmt=con.prepareStatement(query);
            psmt.setString(1,adharrNumber);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data Deleted Successfully");
            EmployeeTable obj = new EmployeeTable();
            dispose();
            obj.setVisible(true);
        }       catch (SQLException ex) {
            System.out.println(""+ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(""+ex);
        }

    }//GEN-LAST:event_jLabel16MouseClicked

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
