
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class viewpage extends javax.swing.JFrame {
    
String regdNo;

    public viewpage() {
        initComponents();
        
        
        regdNo=ViewStudentData.regd;
        System.out.println(""+regdNo);
        
        regdno.setText(regdNo);
        viewDetails();
        
 }
    
    
    public void viewDetails()
    {
        
          String name = null,addmission = null,className=null,sec=null,fname=null,foccupation=null,mname=null,DOB=null,aadhaar=null,gender=null,contact=null,category=null,address=null;
        try
        {
     Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        String query="Select * from studentregistration where Regdno=?";
           PreparedStatement psmt =con.prepareStatement(query);
           
            psmt.setString(1,regdNo);
          
          
            ResultSet rs = psmt.executeQuery();
            
            while(rs.next())
            {
                
              name=rs.getString("Name");
             addmission=rs.getString("Addmissiondate");
              className=rs.getString("Class");
                sec=rs.getString("Sec");
                fname=rs.getString("Fname");
                 foccupation=rs.getString("Foccupation");
                  mname=rs.getString("Mname");
                   DOB=rs.getString("DOB");
                    aadhaar=rs.getString("Aadhaar");
                  gender=rs.getString("Gender");
                 contact=rs.getString("Contactno");
                 category=rs.getString("Category");
                 address=rs.getString("Address");
                
            }
            
            
             name1.setText(name);
             adddate1.setText(addmission); 
             std.setSelectedItem(className);
             sections.setSelectedItem(sec);
             fname1.setText(fname);
             focc1.setText(foccupation);
             mname1.setText(mname);
             dob1.setText(DOB);
             adhaar1.setText(aadhaar);
             Gender.setSelectedItem(gender);
             contact1.setText(contact);
             Category.setSelectedItem(category);
             address1.setText(address);
             
            
   }             
        catch (SQLException ex) {
            System.out.println(""+ex);
                        // Logger.getLogger(viewpage.class.getName()).log(Level.SEVERE, null, ex);
     

    } catch (ClassNotFoundException ex) {
        
     System.out.println(""+ex);
       // Logger.getLogger(viewpage.class.getName()).log(Level.SEVERE, null, ex);
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        sections = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        regdno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        mname1 = new javax.swing.JTextField();
        fname1 = new javax.swing.JTextField();
        contact1 = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();
        adddate1 = new javax.swing.JFormattedTextField();
        adhaar1 = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        dob1 = new javax.swing.JFormattedTextField();
        std = new javax.swing.JComboBox<>();
        focc1 = new javax.swing.JTextField();
        Category = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Student Data");

        sections.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sections.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel2.setText("REGD. NO. :");

        regdno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regdnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel4.setText("D.O.B.  :");

        jLabel5.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel5.setText("Father's Name :");

        jLabel6.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel6.setText("Father's Occupation :");

        jLabel7.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel7.setText("Mother's Name :");

        jLabel8.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel8.setText("Admission Date :");

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel9.setText("Category :");

        jLabel10.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel10.setText("Gender :");

        jLabel11.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel11.setText("Aadhaar ID :");

        jLabel12.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel12.setText("Contact no. :");

        jLabel13.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel13.setText("Class :");

        jLabel14.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel14.setText("Section:");

        jLabel15.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel15.setText("Address :");

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        mname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mname1ActionPerformed(evt);
            }
        });

        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });

        contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact1ActionPerformed(evt);
            }
        });

        address1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address1ActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        std.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        std.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" }));

        Category.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "SC", "OBC" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(std, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(sections, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(mname1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel8))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(87, 87, 87))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(adhaar1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regdno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Category, 0, 150, Short.MAX_VALUE)
                                            .addComponent(Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(adddate1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(focc1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regdno)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(adddate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(name1)
                    .addComponent(std, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sections, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(fname1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(focc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(mname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(adhaar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(contact1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 40, 800, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b9.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 410, 122, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/b11.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17);
        jLabel17.setBounds(300, 410, 130, 40);

        jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 20, 840, 450);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schooldatabasemanagementsystem/30.jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(-10, -50, 1490, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regdnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regdnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regdnoActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void mname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mname1ActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact1ActionPerformed

    private void address1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address1ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
      String a=regdno.getText();
       String b=name1.getText();
      String c=adddate1.getText();
      String d=(String) std.getSelectedItem();
      String e=(String) sections.getSelectedItem();
      String f=fname1.getText();
      String g=focc1.getText();
      String h=mname1.getText();
      String i=dob1.getText();
      String j=adhaar1.getText();
      String k=(String) Gender.getSelectedItem();
      String l=contact1.getText();
      String m=(String) Category.getSelectedItem();
      String o=address1.getText();
     
     try
        {
     Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student registration","root","");
        String query="Update studentregistration set Regdno=?,Name=?,Addmissiondate=?,Class=?,Sec=?,Fname=?,Foccupation=?,Mname=?,DOB=?,Aadhaar=?,Gender=?,Contactno=?,Category=?,Address=? where Regdno=?";
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
                        psmt.setString(14,o);
                 
                 psmt.setString(15, regdNo);
                 
                         psmt.executeUpdate();
                          String query2="Update into studentfee(regdno,name,fathername,class,section) values(?,?,?,?,?)";
                      PreparedStatement psmt1 =con.prepareStatement(query2);
                        psmt1.setString(1,a);
              psmt1.setString(2,b);
                psmt1.setString(3,f);
                  psmt1.setString(4,d);
                    psmt1.setString(5,e);
                      psmt1.execute();
                      
                       String query3="Update into studentattendance(Regdno,Name,fatherName,Class,sec) values(?,?,?,?,?)";
                      PreparedStatement psmt2 =con.prepareStatement(query3);
                        psmt2.setString(1,a);
              psmt2.setString(2,b);
                psmt2.setString(3,f);
                  psmt2.setString(4,d);
                    psmt2.setString(5,e);
                      psmt2.execute();
                     
                         
                         
                         JOptionPane.showMessageDialog(this," Data Updated Successfully");
                         
                         viewpage obj=new viewpage();
                         dispose();
                         obj.setVisible(true);
        } catch (SQLException ex) {
         System.out.println(""+ex);
    } catch (ClassNotFoundException ex) {
         System.out.println(""+ex);
    }
           
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ViewStudentData vsd = new ViewStudentData();
        dispose();
        vsd.setVisible(true);
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
            java.util.logging.Logger.getLogger(viewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewpage().setVisible(true);
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JFormattedTextField adddate1;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField adhaar1;
    private javax.swing.JTextField contact1;
    private javax.swing.JFormattedTextField dob1;
    private javax.swing.JTextField fname1;
    private javax.swing.JTextField focc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private java.awt.Label label1;
    private javax.swing.JTextField mname1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField regdno;
    private javax.swing.JComboBox<String> sections;
    private javax.swing.JComboBox<String> std;
    // End of variables declaration//GEN-END:variables
}
