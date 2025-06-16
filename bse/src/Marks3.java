import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAMEL K NAVIE
 */
public class Marks3 extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pstatement;
    Statement st;
    String cs;
    String user;
    String password;
    String query;
    ResultSet rs;
    String records;
    public Marks3() {
        con = null;
        st = null;
        pstatement = null;
        cs = "jdbc:mysql://localhost:3306/mydb";//use ds connectivity,from localhost,port that the server its running
//at the database name(bse) 
        user = "root";
        password = "";
        Main();

        initComponents();
        // Clear the items in the combolist
        combolist.removeAllItems();
    }

    public void Main() {
        try {
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtregno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combolist = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabellogo = new javax.swing.JLabel();
        txtmaths = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtscience = new javax.swing.JTextField();
        txtenglish = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsst = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ENTER STUDENTS' MARKS FROM PAGE 1");

        txtregno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtregnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Reg No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        combolist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combolist.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combolistItemStateChanged(evt);
            }
        });
        combolist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabellogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabellogo, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mathematics");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Science");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("English");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SST");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Confirm the marks from here");

        btnconfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtregno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(combolist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(txtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtscience)
                                            .addComponent(txtmaths, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtsst, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(btnconfirm))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(8, 8, 8)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combolist, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtregno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmaths, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtscience, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtregnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtregnoActionPerformed
        // TODO add your handling code here:
        //txtregno.setEditable(false);
    }//GEN-LAST:event_txtregnoActionPerformed

    private void combolistItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combolistItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_combolistItemStateChanged

    private void combolistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolistActionPerformed

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
            //Create a statement to execute the query to retrieve the data for the combolist
            Statement stmt = conn.createStatement();
            String query = "SELECT firstname, regno FROM student";
            ResultSet rs = stmt.executeQuery(query);

            // Loop through the ResultSet and add each name to the combolist
            while (rs.next()) {

                String fname = rs.getString("firstname");
                combolist.addItem(fname);

            }

            // Close the ResultSet and statement
            rs.close();
            stmt.close();

            // Add an ActionListener to the combolist to detect when a new name is selected

            // Get the selected name from the combolist
            String selectedName = (String) combolist.getSelectedItem();

            try {
                // Create a statement to execute the query to retrieve the regno for the selected name
                Statement stmt2 = conn.createStatement();
                String query2 = "SELECT regno FROM student WHERE firstname = '" + selectedName + "'";
                ResultSet rs2 = stmt2.executeQuery(query2);

                // Set the value of the txtregno JTextField to the retrieved regno
                if (rs2.next()) {
                    txtregno.setText(rs2.getString("regno"));
                }

                // Close the ResultSet and statement
                rs2.close();
                stmt2.close();
            } catch (SQLException ex) {
                // Handle the exception
            }

            try {
                // Create a statement to execute the query to retrieve the regno for the selected name
                Statement stmt3 = conn.createStatement();
                String query3 = "SELECT photo FROM student WHERE firstname = '" + selectedName + "'";
                ResultSet rs3 = stmt3.executeQuery(query3);

                // Set the value of the txtregno JTextField to the retrieved regno
                if (rs3.next()) {

                    // Retrieve photo from its path
                    String path2 = rs3.getString("photo");
                    File file = new File(path2);
                    BufferedImage image = ImageIO.read(file);

                    // Resize image to fit in JLabel
                    int width = jLabellogo.getWidth();
                    int height = jLabellogo.getHeight();
                    Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                    // Set image in JLabel
                    jLabellogo.setIcon(new ImageIcon(scaledImage));

                }

                // Close the ResultSet and statement
                rs3.close();
                stmt3.close();
            } catch (SQLException ex) {
                // Handle the exception
            }    catch (IOException ex) {
                Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Close the connection
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combolistActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        /*
        try{
            // Get user input
            String regno = txtregno.getText();
            //String name = combolist.getSelectedItem().toString();
            String maths = txtmaths.getText();
            String science = txtscience.getText();
            String english = txtenglish.getText();
            String sst = txtsst.getText();
            String id = null;
            // Create a prepared statement
            pstatement = con.prepareStatement("INSERT INTO marks (id, regno, maths, science, english, sst) VALUES (?, ?, ?, ?, ?, ?)");

            // Bind parameters
            pstatement.setString(1, id);
            pstatement.setString(2, regno);
            pstatement.setString(3, maths);
            pstatement.setString(4, science);
            pstatement.setString(5, english);
            pstatement.setString(6, sst);
            if (txtregno.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Regestration Number is missing");
                txtregno.requestFocus();
                return;
            }
            else if (combolist.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null,"Select the pupil's name to proceed");
                return;
            }
            else if(txtmaths.getText().equals("")){
                JOptionPane.showMessageDialog(null,"You haven't entered Mathematics score");
                txtmaths.requestFocus();
                return;
            }
            else if (txtscience.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"You haven't entered Sciences score");
                txtscience.requestFocus();
                return;
            }
            else if(txtenglish.getText().equals("")){
                JOptionPane.showMessageDialog(null,"You haven't entered English score");
                txtenglish.requestFocus();
                return;
            }

            else if (txtsst.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"You haven't entered SST score");
                txtsst.requestFocus();
                return;
            }
            else{
                JOptionPane.showMessageDialog(null,"Marks Stored Successfully");
                txtregno.setText("");
                //combolist.setSelectedItem(false);
                txtmaths.setText("");
                txtscience.setText("");
                txtenglish.setText("");
                txtsst.setText("");
                txtmaths.requestFocus();
                //int rows = pstatement.executeUpdate();
                //JOptionPane.showMessageDialog(null,rows + pstatement.toString() " rows inserted");
                //System.out.println(rows + " rows inserted");

            }
            // Close the statement and connection
            pstatement.close();
            con.close();
            //JOptionPane.showMessageDialog(null, "Record Confirmed");
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        //catch (com.mysql.jdbc.exceptions.MySQLNonTransientConnectionException e) {
            // handle the exception
            //System.err.println("Error: " + e.getMessage());
            //}
        */

        String regno = txtregno.getText();
        //String name = combolist.getSelectedItem().toString();
        String maths = txtmaths.getText();
        String science = txtscience.getText();
        String english = txtenglish.getText();
        String sst = txtsst.getText();
        //String id = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "INSERT INTO marks3 (regno,maths,science,english,sst) VALUES('"+regno+"','"+maths+"','"+science+"','"+english+"','"+sst+"')";
            st.execute(query);//this statement is used to excute the above query
            JOptionPane.showMessageDialog(null,"Record Saved");
            //After sving you might need to clear the previous content and get anothrr recod
            txtregno.setText("");
            txtmaths.setText("");
            txtscience.setText("");
            txtenglish.setText("");
            txtsst.setText("");
            //set focus to txtRegNo
            txtmaths.requestFocus();
        }
        catch(SQLException ex){ex.printStackTrace();
        }
        catch(ClassNotFoundException e){e.printStackTrace();
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
    }//GEN-LAST:event_btnconfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Marks3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marks3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marks3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marks3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marks3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> combolist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabellogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtenglish;
    private javax.swing.JTextField txtmaths;
    private javax.swing.JTextField txtregno;
    private javax.swing.JTextField txtscience;
    private javax.swing.JTextField txtsst;
    // End of variables declaration//GEN-END:variables
}
