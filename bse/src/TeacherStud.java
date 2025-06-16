
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TeacherStud extends javax.swing.JFrame {
    Connection con;
   PreparedStatement statement;
   Statement st,st1,st2,st3,st4;
   String cs;
   String user;
   String password;
   String query;
   ResultSet rs1,rs2,rs3,rs4;
   String records;
   
    public TeacherStud() {
       con = null;
       st1 = null;
       st2 = null;
       st3 = null;
       st4 = null;
      
       statement = null;
        cs ="jdbc:mysql://localhost:3306/mydb";//use ds connectivity,from localhost,port that the server its running
//at the database name(bse) 
user = "root";
password = "";
        Main();
        initComponents();
        //combolist.removeAllItems();
        combolist.addItem("isa");
    }
     public void Main(){
       try {
           Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs1 = st1.executeQuery("select * from student");
            
            
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
       
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        myLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmaths = new javax.swing.JTextField();
        txtscience = new javax.swing.JTextField();
        txtenglish = new javax.swing.JTextField();
        txtsst = new javax.swing.JTextField();
        txttotal1 = new javax.swing.JTextField();
        txtaggregate = new javax.swing.JTextField();
        txtmaths2 = new javax.swing.JTextField();
        txtscience2 = new javax.swing.JTextField();
        txtenglish2 = new javax.swing.JTextField();
        txtsst2 = new javax.swing.JTextField();
        txttotal2 = new javax.swing.JTextField();
        txtaggregate2 = new javax.swing.JTextField();
        txtmaths1 = new javax.swing.JTextField();
        txtscience1 = new javax.swing.JTextField();
        txtenglish1 = new javax.swing.JTextField();
        txtsst1 = new javax.swing.JTextField();
        txttotal3 = new javax.swing.JTextField();
        txtaggregate3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelphoto3 = new javax.swing.JLabel();
        combolist = new javax.swing.JComboBox<>();

        setTitle("TEACHER'S MANAGING WINDOW");
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Reg NO");

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Stud Name");

        txtRegNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Study Progress");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Term");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mathematics");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Science");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("English");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SST");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("  First");

        txtsst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsst2ActionPerformed(evt);
            }
        });

        txttotal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotal2ActionPerformed(evt);
            }
        });

        txtaggregate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaggregate2ActionPerformed(evt);
            }
        });

        txtaggregate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaggregate3ActionPerformed(evt);
            }
        });

        jLabel13.setText("Press check button to fill the above with  results ");

        jLabel14.setText("Press Here to confirml the above results ");

        btnConfirm.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(0, 0, 0));
        btnCheck.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText(" Second");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText(" Third");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Total  Marks");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Division");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelphoto3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelphoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        combolist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combolist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(184, 184, 184)
                        .addComponent(myLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(50, 50, 50))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(txtenglish, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtscience, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtmaths, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtsst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(23, 23, 23)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtenglish2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtscience2)
                                                                .addComponent(txtmaths2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(txtsst2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(35, 35, 35)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtaggregate2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(13, 13, 13)
                                                    .addComponent(txtaggregate3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(14, 14, 14))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCheck))
                                            .addGap(39, 39, 39))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtaggregate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txttotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)
                                            .addComponent(txttotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtenglish1)
                                                .addComponent(txtscience1)
                                                .addComponent(txtmaths1)
                                                .addComponent(txtsst1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(combolist, javax.swing.GroupLayout.Alignment.LEADING, 0, 405, Short.MAX_VALUE)
                                .addComponent(txtRegNo, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addComponent(myLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(combolist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtmaths, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtmaths2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtscience, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtenglish2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txtsst2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtsst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(txtenglish1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtmaths1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtscience1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(txtsst1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(txtscience2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtaggregate2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtaggregate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtaggregate3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsst2ActionPerformed

    private void txttotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotal2ActionPerformed

    private void txtaggregate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaggregate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaggregate2ActionPerformed

    private void txtaggregate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaggregate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaggregate3ActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        try {

            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs, user, password);
            st2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs2 = st2.executeQuery("select * from marks");

            st3 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs3 = st3.executeQuery("select * from marks2");

            st4 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs4 = st4.executeQuery("select * from marks3");

            while(rs1.next()&&rs2.next()&&rs3.next()&&rs4.next()){
                //from student table
                txtRegNo.setText(rs1.getString(2));
                String firstname= rs1.getString(3);
                String lastname= rs1.getString(3);
                String comb = firstname+" "+lastname;
                //txtName.setText(comb);

                //from marks table
                txtmaths.setText(rs2.getString("maths"));
                txtscience.setText(rs2.getString("science"));
                txtenglish.setText(rs2.getString("english"));
                txtsst.setText(rs2.getString("sst"));
                int maths,science,english,sst,tt;
                maths= Integer.parseInt(txtmaths.getText());
                science= Integer.parseInt(txtscience.getText());
                english= Integer.parseInt(txtenglish.getText());
                sst= Integer.parseInt(txtsst.getText());
                tt= (maths+science+english+sst);
                txttotal1.setText(Integer.toString(tt));
                if (tt>=300){
                    txtaggregate.setText("DIV-1");
                }
                else if (tt>=200&&tt<300){
                    txtaggregate.setText("DIV-2");
                }
                else if (tt>=100&&tt<200){
                    txtaggregate.setText("DIV-3");
                }
                else if (tt>=50&&tt<100){
                    txtaggregate.setText("DIV-4");
                }
                else if (tt>=0&&tt<50){
                    txtaggregate.setText("DIV-U");
                }

                //from marks2 table
                txtmaths2.setText(rs3.getString("maths"));
                txtscience2.setText(rs3.getString("science"));
                txtenglish2.setText(rs3.getString("english"));
                txtsst2.setText(rs3.getString("sst"));
                int maths1,science1,english1,sst1,tt2;
                maths1= Integer.parseInt(txtmaths2.getText());
                science1= Integer.parseInt(txtmaths2.getText());
                english1= Integer.parseInt(txtmaths2.getText());
                sst1= Integer.parseInt(txtmaths2.getText());
                tt2= (maths1+science1+english1+sst1);
                txttotal2.setText(Integer.toString(tt2));
                if (tt2>=300){
                    txtaggregate2.setText("DIV-1");
                }
                else if (tt2>=200&&tt2<300){
                    txtaggregate2.setText("DIV-2");
                }
                else if (tt2>=100&&tt2<200){
                    txtaggregate2.setText("DIV-3");
                }
                else if (tt2>=50&&tt2<100){
                    txtaggregate2.setText("DIV-4");
                }
                else if (tt2>=0&&tt2<50){
                    txtaggregate2.setText("DIV-U");
                }

                //from marks3 table
                txtmaths1.setText(rs4.getString("maths"));
                txtscience1.setText(rs4.getString("science"));
                txtenglish1.setText(rs4.getString("english"));
                txtsst1.setText(rs4.getString("sst"));
                int maths2,science2,english2,sst2,tt3;
                maths2= Integer.parseInt(txtmaths1.getText());
                science2= Integer.parseInt(txtscience1.getText());
                english2= Integer.parseInt(txtenglish1.getText());
                sst2= Integer.parseInt(txtsst1.getText());
                tt3= (maths2+science2+english2+sst2);
                txttotal3.setText(Integer.toString(tt3));

                if (tt3>=300){
                    txtaggregate3.setText("DIV-1");
                }
                else if (tt3>=200&&tt3<300){
                    txtaggregate3.setText("DIV-2");
                }
                else if (tt3>=100&&tt3<200){
                    txtaggregate3.setText("DIV-3");
                }
                else if (tt3>=50&&tt3<100){
                    txtaggregate3.setText("DIV-4");
                }
                else if (tt3>=0&&tt3<50){
                    txtaggregate3.setText("DIV-U");
                }
            }

        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
       String regno= txtRegNo.getText();
      // String name= combolist.getSelectedItem().toString();
       String maths= txtmaths.getText();
       String science= txtmaths.getText();
       String english= txtmaths.getText();
       String sst= txtmaths.getText();
       String total = txttotal1.getText();
       String division= txtaggregate.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "INSERT INTO results (regno,maths,science,english,sst,total,division) VALUES('"+regno+"','"+maths+"','"+science+"','"+english+"','"+sst+"','"+total+"','"+division+"')";
            st.execute(query);//this statement is used to excute the above query
            JOptionPane.showMessageDialog(null,"Record Saved");
            //After sving you might need to clear the previous content and get anothrr recod
            txtRegNo.setText("");
            txtmaths.setText("");
            txtscience.setText("");
            txtenglish.setText("");
            txtsst.setText("");
            txtmaths1.setText("");
            txtscience1.setText("");
            txtenglish1.setText("");
            txtsst1.setText("");
            txtmaths2.setText("");
            txtscience2.setText("");
            txtenglish2.setText("");
            txtsst2.setText("");
            txttotal1.setText("");
            txttotal2.setText("");
            txttotal3.setText("");
            txtaggregate.setText("");
            txtaggregate2.setText("");
            txtaggregate3.setText("");
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
       
      
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void combolistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolistActionPerformed
        // TODO add your handling code here:
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
                    txtRegNo.setText(rs2.getString("regno"));
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
                    int width = jLabelphoto3.getWidth();
                    int height = jLabelphoto3.getHeight();
                    Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                    // Set image in JLabel
                    jLabelphoto3.setIcon(new ImageIcon(scaledImage));

                }

                // Close the ResultSet and statement
                rs3.close();
                stmt3.close();
            } catch (SQLException ex) {
                // Handle the exception
            } catch (IOException ex) {
                Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Close the connection
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Marks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combolistActionPerformed

    private void timerActionPerformed(java.awt.event.ActionEvent evt) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
    String time = sdf.format(new java.util.Date());
    myLabel.setText(time);
}

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
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
            java.util.logging.Logger.getLogger(TeacherStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherStud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> combolist;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelphoto3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel myLabel;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtaggregate;
    private javax.swing.JTextField txtaggregate2;
    private javax.swing.JTextField txtaggregate3;
    private javax.swing.JTextField txtenglish;
    private javax.swing.JTextField txtenglish1;
    private javax.swing.JTextField txtenglish2;
    private javax.swing.JTextField txtmaths;
    private javax.swing.JTextField txtmaths1;
    private javax.swing.JTextField txtmaths2;
    private javax.swing.JTextField txtscience;
    private javax.swing.JTextField txtscience1;
    private javax.swing.JTextField txtscience2;
    private javax.swing.JTextField txtsst;
    private javax.swing.JTextField txtsst1;
    private javax.swing.JTextField txtsst2;
    private javax.swing.JTextField txttotal1;
    private javax.swing.JTextField txttotal2;
    private javax.swing.JTextField txttotal3;
    // End of variables declaration//GEN-END:variables
}
