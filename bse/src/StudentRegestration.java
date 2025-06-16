import java.awt.Image;
import java.io.File;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class StudentRegestration extends javax.swing.JFrame {
    String selectedImagePath ;
    Connection con;
   PreparedStatement statement;
   Statement st;
   String cs;
   String user;
   String password;
   String query;
   ResultSet rs;
   String records;
   
   //Redio batton's variebles after being grouped
   String s8;//
   
    public StudentRegestration() {
        con = null;
       st = null;
       statement = null;
        cs ="jdbc:mysql://localhost:3306/mydb";//use ds connectivity,from localhost,port that the server its running
        //at the database name(bse) 
        user = "root";
        password = "";
        initComponents();
        Main();
    }
    

    public void Main(){
       try {
           Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from student");
            
             
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
       
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtphonenumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        rdmale = new javax.swing.JRadioButton();
        rdfemale = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jlabel = new javax.swing.JLabel();
        btnupload = new javax.swing.JButton();
        txtregno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jMenu1.setText("jMenu1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP MENU");
        setBackground(new java.awt.Color(255, 204, 255));
        setForeground(new java.awt.Color(0, 255, 0));

        jPanel2.setBackground(new java.awt.Color(0, 255, 51));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 64, 28));

        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("PLEASE ENTER THE FOLLOWING DETAILS TO SIGN UP");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 362, 29));
        jPanel2.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 185, 29));

        jLabel6.setText("Date of Birth");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 74, 31));

        jLabel2.setText("Last Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 64, 25));

        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 185, 30));
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 185, 33));

        jLabel3.setText(" UserName");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 64, 26));

        jLabel10.setBackground(new java.awt.Color(255, 255, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setText("Choose your photo to be uploaded");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 170, 26));

        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 70, 30));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 185, 26));

        jLabel5.setText("Phone Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 70, 24));

        txtphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 185, 30));

        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 62, 34));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 186, 29));

        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 64, 26));

        txtdate.setDateFormatString(" dd - MM - yyyy");
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, 30));

        buttonGroup.add(rdmale);
        rdmale.setText("Male");
        rdmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmaleActionPerformed(evt);
            }
        });
        jPanel2.add(rdmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 60, -1));

        buttonGroup.add(rdfemale);
        rdfemale.setText("Female");
        rdfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfemaleActionPerformed(evt);
            }
        });
        jPanel2.add(rdfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("<<Back");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        btnsignup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Press signup here ----->");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 180, 20));

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(208, 212));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(208, 212));

        jDesktopPane1.setLayer(jlabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 350, 250));

        btnupload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupload.setText("Upload");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });
        jPanel2.add(btnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));
        jPanel2.add(txtregno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 185, 29));

        jLabel9.setBackground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Reg Number");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

        
    }//GEN-LAST:event_txtemailActionPerformed

    private void rdfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfemaleActionPerformed
        // TODO add your handling code here:
        s8 = rdfemale.getText();
        
    }//GEN-LAST:event_rdfemaleActionPerformed

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
        s8 = rdmale.getText();
    }//GEN-LAST:event_rdmaleActionPerformed

    private void txtphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Stud_Login().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
         try {
            String s0 = txtregno.getText();
            String s1 = txtfirstname.getText();
            String s2 = txtlastname.getText();
            String s3 = txtusername.getText();
            String s4 = txtpassword.getText();
            String s5 = txtemail.getText();
            String s6 = txtphonenumber.getText();
        
            String s10=selectedImagePath;
            // Get the selected date from the JCalendar
            Date selectedDate = txtdate.getDate();
            // Convert the date to a string
            String s7 = new SimpleDateFormat("yyyy-MM-dd").format(selectedDate);
            
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "INSERT INTO student (regno,firstname,lastname,username,password,email,phonenumber,dob,gender,photo) VALUES('"+s0+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s10+"')";
            
            if (txtregno.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Reg Number's field can't be null");
                txtregno.requestFocus();
                return;
            }
            else if (txtfirstname.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"First name field can't be null");
            txtfirstname.requestFocus();
            return;
            }

            else if (txtlastname.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Last Name field can't be null");
                txtlastname.requestFocus();
                return;

            }
            else if (txtpassword.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Pssword field can't be null");
                txtpassword.requestFocus();
                return;

            }

            else if (txtemail.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Email field can't be null");
                txtemail.requestFocus();
                return;

            }
            else if(s8.equals("")){
                JOptionPane.showMessageDialog(null,"Select your Gender to proceed");
                return;
            }

            else if (txtphonenumber.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Phone Number field can't be null");
                txtphonenumber.requestFocus();
                return;

            }

            else{
                //if (txtregno.getText().equals(txtregno.getText())||txtfirstname.getText().equals(txtfirstname.getText()) || txtlastname.getText().equals(txtlastname.getText())|| selectedDate.equals(selectedDate)) {
                    JOptionPane.showMessageDialog(null,"Your account has been sucessifully created");
                     new Stud_Login().setVisible(true);
                    this.dispose();                   
                    /*txtfirstname.setText("");
                    txtlastname.setText("");
                    txtusername.setText("");
                    txtpassword.setText("");
                    txtemail.setText("");
                    txtphonenumber.setText("");
                    txtdate.setDate(null);
                    //txtdate.cleanup();
                    buttonGroup.clearSelection();
                    txtfirstname.requestFocus();
                    */
            }

            st.execute(query);//this statement is used to excute the above query
            
        }
        catch(SQLException ex){ex.printStackTrace();
        }
        catch(ClassNotFoundException e){e.printStackTrace();
        }

        catch (NullPointerException e) {
            // Handle the null pointer exception
            // This block will be executed if the user has not selected a date
            JOptionPane.showMessageDialog(null,"Make sure that Date of Birth and gender are selected");
            txtregno.requestFocus();
        }
        finally{
            try {
                if (st != null){
                    st.close();
                }
                if (con != null)
                con.close();
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }}
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
       
            JFileChooser browseImageFile = new JFileChooser();
         // Filter image extensions
         FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
         browseImageFile.addChoosableFileFilter(fnef);
         int showOpenDialogue = browseImageFile.showOpenDialog(null);

         if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
             File selectedImageFile = browseImageFile.getSelectedFile();
             //String selectedImagePath = selectedImageFile.getAbsolutePath();
             
              
              selectedImagePath = selectedImageFile.getAbsolutePath();
            // Replace backslashes (\) with forward slashes (/) in the file path
            selectedImagePath = selectedImagePath.replace("\\", "/");
             
              // Display image on jlabel
             ImageIcon ii = new ImageIcon(selectedImagePath);
             // Resize image to fit jlabel

             Image image = ii.getImage().getScaledInstance(jlabel.getWidth(), jlabel.getHeight(), Image.SCALE_SMOOTH);

             jlabel.setIcon(new ImageIcon(image));
         }

    }//GEN-LAST:event_btnuploadActionPerformed
    public static void main(String args[]) {
    //void reg(){
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
            java.util.logging.Logger.getLogger(StudentRegestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegestration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignup;
    private javax.swing.JButton btnupload;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JLabel jlabel;
    private javax.swing.JRadioButton rdfemale;
    private javax.swing.JRadioButton rdmale;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txtregno;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

  byte[] photo =null;  
  String filename=null;
  private ImageIcon format=null;
}
