
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


public class vieemployeedata extends javax.swing.JFrame {

     String adharr=null;
  
 
   
     
    public vieemployeedata() {
        initComponents();
        
          
      adharr=EmployeeTable.adharrNumber;
        
     
        viewDetails();
   }
    
    
    public void viewDetails()
    {
       String a = null,b = null,c=null,d=null,e=null,f=null,g=null,h=null,i=null,j=null,k=null,l=null,m=null;
        
        
             try {
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        
            String query="Select * from employeeregistration where Aadhaar=? ";
            
            PreparedStatement psmt=con.prepareStatement(query);
            
            psmt.setString(1,adharr);
            
            ResultSet rs=psmt.executeQuery();
            
            while(rs.next())
            {
               
                b=rs.getString("DOB");
                  c=rs.getString("Name");
                   d=rs.getString("FHname");
                    e=rs.getString("Gender");
                     f=rs.getString("Category");
                      g=rs.getString("Email");
                       h=rs.getString("contact");
                      i=rs.getString("Address");
                      j=rs.getString("Salary");
                      k=rs.getString("Qualification");
                       l=rs.getString("Designation");
                       m=rs.getString("Keystrengths");
            }
                
               aadhaar.setText(adharr);
             dob2.setText(b);
             name2.setText(c);
             fhname2.setText(d);
             Gender.setSelectedItem(e);
             Category.setSelectedItem(f);
             email2.setText(g);
             contact2.setText(h);
             address2.setText(i);
             salary.setText(j);
             qual2.setText(k);
             designation.setSelectedItem(l);
             key2.setText(m);
             } catch (SQLException ex) {
                 
                 System.out.println(""+ex);
            
         } catch (ClassNotFoundException ex) {
          System.out.println(""+ex);
         }
            
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        fhname2 = new javax.swing.JTextField();
        contact2 = new javax.swing.JTextField();
        address2 = new javax.swing.JTextField();
        aadhaar = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        Category = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dob2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        qual2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        designation = new javax.swing.JComboBox<>();
        key2 = new javax.swing.JTextField();
        email2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b9.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 420, 122, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b11.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17);
        jLabel17.setBounds(260, 420, 130, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Employee Data");

        jLabel3.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel3.setText("Email :");

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel4.setText("D.O.B.  :");

        jLabel5.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel5.setText("Father's/Husband's :");

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel9.setText("Category :");

        jLabel10.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel10.setText("Gender :");

        jLabel11.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel11.setText("Aadhaar ID :");

        jLabel12.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel12.setText("Contact no. :");

        jLabel15.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel15.setText("Address :");

        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });

        fhname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fhname2ActionPerformed(evt);
            }
        });

        contact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact2ActionPerformed(evt);
            }
        });

        address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address2ActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        Gender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Category.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "SC", "OBC" }));
        Category.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel7.setText("Name :");

        jLabel8.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel8.setText("Key Strengths :");

        jLabel20.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel20.setText("Designation :");

        jLabel21.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel21.setText("Qualification :");

        designation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Teacher", "librarian", "Clerk", "Peon" }));
        designation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });

        email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel6.setText("Salary :");

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qual2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(designation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fhname2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contact2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aadhaar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(136, 136, 136))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dob2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aadhaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fhname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(contact2)
                    .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(salary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 50, 740, 340);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 800, 460);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/30.jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(-10, -50, 1490, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void fhname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fhname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fhname2ActionPerformed

    private void contact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact2ActionPerformed

    private void address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address2ActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key2ActionPerformed

    private void email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email2ActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       String a=aadhaar.getText();
       String b=dob2.getText();
      String c=name2.getText();
      String d= fhname2.getText();
      String e=(String) Gender.getSelectedItem();
      String f=(String) Category.getSelectedItem();
      String g=email2.getText();
      String h=contact2.getText();
      String i=address2.getText();
      String j=salary.getText();
      String k= qual2.getText();
      String l=(String) designation.getSelectedItem();
      String m= key2.getText();
     ;
     
     try
        {
     Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        String query="update employeeregistration set Aadhaar=?,DOB=?,Name=?,FHname=?,Gender=?,category=?,Email=?,Contact=?,Address=?,Salary=?,Qualification=?,Designation=?,Keystrengths=? where Aadhaar=?";
           PreparedStatement psmt =con.prepareStatement(query);
           psmt.setString(1,a);
            psmt.setString(2,b);
             psmt.setString(3,c);
              psmt.setString(4,d);
               psmt.setString(5,e);
                psmt.setString(6,f);
                 psmt.setString(7,g);
                   psmt.setString(8,h);
                     psmt.setString(9,i);
                         psmt.setString(10,j);
                         psmt.setString(11,k);
                         psmt.setString(12,l);
                         psmt.setString(13,m);
                          psmt.setString(14, adharr);
                 
                         psmt.executeUpdate();
                         
                         
                         JOptionPane.showMessageDialog(this," Data Updated Successfully");
                         
                         EmployeeTable obj=new EmployeeTable();
                         dispose();
                         obj.setVisible(true);
        } catch (SQLException ex) {
         System.out.println(""+ex);
    } catch (ClassNotFoundException ex) {
         System.out.println(""+ex);
    }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      EmployeeTable et=new EmployeeTable();
      dispose();
      et.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(vieemployeedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vieemployeedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vieemployeedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vieemployeedata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vieemployeedata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField aadhaar;
    private javax.swing.JTextField address2;
    private javax.swing.JTextField contact2;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JTextField dob2;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField fhname2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField key2;
    private java.awt.Label label1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField qual2;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables

    
}
