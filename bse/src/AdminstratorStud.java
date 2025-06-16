import com.itextpdf.text.DocumentException;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.awt.image.FileImageSource;

/**
 * The AdminstratorStud class represents a GUI for managing student records.
 */
public class AdminstratorStud extends javax.swing.JFrame {

    int count;
    String s7;
    String logicalpath;
    String gender;

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

   private final Timer timer;
   private final SimpleDateFormat sdf;

    public AdminstratorStud() {

        con = null;
        st = null;
        statement = null;

        cs = "jdbc:mysql://localhost:3306/mydb";//use ds connectivity,from localhost,port that the server its running
        //at the database name(bse) 
        user = "root";
        password = "";
        Main();

        initComponents();
         //////////////////////////////////////////////////////////////////////////////
         // Create a Timer that updates the JLabel every second
    timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jLabeltime.setText(sdf.format(new Date()));
        }
    });
    timer.start();
    
    // Create a SimpleDateFormat that formats the current time in the "HH:mm:ss" format
    sdf = new SimpleDateFormat("HH:mm:ss");
    
    }
    
    /**
     * Initializes the database connection and loads the student records.
     */
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

    private JLabel imageLabel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jMenuItem6 = new javax.swing.JMenuItem();
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
        jLabel5 = new javax.swing.JLabel();
        txtphonenumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelphoto = new javax.swing.JLabel();
        btnupload = new javax.swing.JButton();
        txtRegNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btntDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        rdmale = new javax.swing.JRadioButton();
        rdfemale = new javax.swing.JRadioButton();
        rdothers = new javax.swing.JRadioButton();
        txtpassword = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabeltime = new javax.swing.JLabel();
        jlabelimage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINSTRATORS' SIDE TO MANAGE THE STUDENTS WITH IN SCHOOL");

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 28));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("     WELCOME TO THE ADMINSTRATORS' PAGE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 570, 29));
        jPanel2.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 185, 29));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 90, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, 25));

        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 185, 30));
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 185, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(" UserName");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, 26));

        jLabel10.setBackground(new java.awt.Color(255, 255, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("Choose your photo to be uploaded");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 230, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 100, 24));

        txtphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 290, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 62, 34));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 290, 29));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 26));

        txtdate.setDateFormatString(" dd - MM - yyyy");
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 280, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("<<Back");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, 40));

        btnsignup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsignup.setText("Regester");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 90, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Press signup here ----->");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 180, 30));

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(208, 212));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(208, 212));

        jDesktopPane1.setLayer(jLabelphoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelphoto, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelphoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 270, 250));

        btnupload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupload.setText("Upload");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });
        jPanel2.add(btnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 483, 80, 30));

        txtRegNo.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.add(txtRegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 185, 29));

        jLabel9.setBackground(new java.awt.Color(0, 51, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText(" Reg Number");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 28));

        jLabel13.setBackground(new java.awt.Color(0, 51, 51));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" In this page you are free to manage students' information accordingly");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 510, 30));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 80, 40));

        btntDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btntDelete.setForeground(new java.awt.Color(0, 0, 255));
        btntDelete.setText("Delete");
        btntDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btntDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 80, 40));

        btnEdit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 80, 40));

        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 0, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 70, 30));

        btnPrevious.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(0, 0, 255));
        btnPrevious.setText("Privious");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, 30));

        btnFirst.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(0, 0, 255));
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel2.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 70, 30));

        btnLast.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLast.setForeground(new java.awt.Color(0, 0, 255));
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel2.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 70, 30));

        btnFind.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnFind.setForeground(new java.awt.Color(0, 0, 255));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel2.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 80, 30));

        jButton2.setText("Clean Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 80, 30));

        jButton3.setText("check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 60, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel15.setText("check the no_of Students recorded so far");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 220, 30));

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        jPanel2.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 80, 30));

        buttonGroup2.add(rdmale);
        rdmale.setText("Male");
        jPanel2.add(rdmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        buttonGroup2.add(rdfemale);
        rdfemale.setText("Female");
        jPanel2.add(rdfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        buttonGroup2.add(rdothers);
        rdothers.setText("Others");
        jPanel2.add(rdothers, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, 30));

        jButton4.setBackground(new java.awt.Color(0, 51, 255));
        jButton4.setText("Continue as Head Teacher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 190, -1));

        jLabeltime.setBackground(new java.awt.Color(255, 255, 153));
        jLabeltime.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabeltime.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeltime, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabeltime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, 30));

        jMenu1.setText("File");

        jMenuItem1.setText("Termly Marks");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Attendence Sheets");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setText("Generate Reports");

        jMenuItem8.setText("Termly Report");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem3.setText("Class Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Results");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("MaleReport");
        jMenuItem5.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jMenuItem5HierarchyChanged(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem7.setText("Female Report");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText("Division ones");
        jMenu3.add(jMenuItem9);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlabelimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(576, 576, 576)
                .addComponent(jlabelimage, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
        ;

    }//GEN-LAST:event_txttotalActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement object
            Statement statement = connection.createStatement();

            // Execute an SQL SELECT statement with a COUNT(*) function
            String countQuery = "SELECT COUNT(*) FROM student";
            ResultSet resultSet = statement.executeQuery(countQuery);

            // Retrieve the result
            resultSet.next();
            count = resultSet.getInt(1);
            //String total = String.valueOf(count);
            txttotal.setText(Integer.toString(count));
            System.out.println("Number of records: " + count);
            //txttotal.setText(total);
            // Close the statement, result set, and connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        try {

            if (rdmale.isSelected() == true) {
                gender = "Male";
            } else if (rdfemale.isSelected() == true) {
                gender = "Female";
            } else if (rdothers.isSelected() == true) {
                gender = "Others";

            } else {
                JOptionPane.showMessageDialog(null, "Select the gender");
                return;
            }

            String regNo = txtRegNo.getText().trim();
            String firstName = new String(txtfirstname.getText()).trim();
            String lastName = txtlastname.getText().trim();
            String username = txtusername.getText().trim();
            String password = new String(txtpassword.getPassword()).trim();
            String email = txtemail.getText().trim();
            String phoneNumber = txtphonenumber.getText().trim();
            String photo = selectedImagePath;
            Date selectedDate = txtdate.getDate();
            // Convert the date to a string
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String dob = dateFormat.format(selectedDate);

            if (regNo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Reg Number's field can't be null");
                txtRegNo.requestFocus();
                return;
            } else if (firstName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "First name field can't be null");
                txtfirstname.requestFocus();
                return;
            } else if (lastName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Last Name field can't be null");
                txtlastname.requestFocus();
                return;
            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password field can't be null");
                txtpassword.requestFocus();
                return;
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email field can't be null");
                txtemail.requestFocus();
                return;
            } else if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Select your Gender to proceed");
                return;
            } else if (phoneNumber.isEmpty() || !phoneNumber.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Phone Number field can't be null and must contain only digits");
                txtphonenumber.requestFocus();
                return;
            } else if (selectedDate == null) {
                JOptionPane.showMessageDialog(null, "Please select a date of birth.");
                return;
            }
            // Use a prepared statement to insert the data into the database
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs, "root", "");
            String query = "INSERT INTO student (regno, firstname, lastname, username, password, email, phonenumber, dob, gender, photo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, regNo);
            statement.setString(2, firstName);
            statement.setString(3, lastName);
            statement.setString(4, username);
            statement.setString(5, password);
            statement.setString(6, email);
            statement.setString(7, phoneNumber);
            statement.setString(8, dob);
            statement.setString(9, gender);
            statement.setString(10, photo);

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Your account has been successfully created");
            
            this.dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnsignupActionPerformed

    private void btntDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntDeleteActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();

            String query1 = "SELECT * FROM student WHERE regno = '" + txtRegNo.getText() + "'";
            rs = st.executeQuery(query1);
            if (rs.first() && rs.getString("regno").equals(txtRegNo.getText())) {
                query = "DELETE FROM student WHERE regno = '" + txtRegNo.getText() + "'";
                st.executeUpdate(query);
                txtRegNo.setText("");
                txtfirstname.setText("");
                txtlastname.setText("");
                txtusername.setText("");
                txtpassword.setText("");
                txtemail.setText("");
                txtphonenumber.setText("");
                txtdate.setDate(null);
                //txtdate.cleanup();
                rdmale.setSelected(false);
                rdfemale.setSelected(false);

                txtfirstname.requestFocus();
                JOptionPane.showMessageDialog(null, "record deleted");
            } else {
                JOptionPane.showMessageDialog(null, "not deleted, record not found");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btntDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtRegNo.setText("");
        txtfirstname.setText("");
        txtlastname.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtemail.setText("");
        txtphonenumber.setText("");
        txtdate.setDate(null);
        txtdate.cleanup();
        buttonGroup2.clearSelection();
        txtRegNo.requestFocus();
       
        jLabelphoto.setIcon(null);
        ///jLabelphoto.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();
            String query1 = "SELECT * FROM student WHERE regno = '"+txtRegNo.getText()+"'";
            rs = st.executeQuery(query1);
            if (rs.first() && rs.getString("regno").equals(txtRegNo.getText())) { 
                query = "UPDATE  customers SET firstname = '"+txtfirstname.getText()+"', lastname = '"+txtlastname.getText()+"', username = '"+txtusername.getText()+"', password = '"+new String(txtpassword.getPassword())+"', email = '"+txtemail.getText()+"', phonenumber = '"+txtphonenumber.getText()+"', lastname = '"+gender+"', lastname = '"+txtlastname.getText()+"', WHERE regno = '"+txtRegNo.getText()+"'";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "record edited");
            }
            else {
                if (txtlastname.getText()=="") {
                    JOptionPane.showMessageDialog(null,"Last Name field can't be null");
                    txtlastname.requestFocus();
                    return;
                } 
                else if (new String(txtpassword.getPassword())=="") {
                    JOptionPane.showMessageDialog(null,"Password field can't be null");
                    txtpassword.requestFocus();
                    return;
                } else if (gender.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Select your Gender to proceed");
                    return;
                } else if (txtphonenumber.getText()=="" || !txtphonenumber.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(null,"Phone Number field can't be null and must contain only digits");
                    txtphonenumber.requestFocus();
                    return;
                } else if (txtdate.getDate() == null) {
                    JOptionPane.showMessageDialog(null,"Please select a date of birth.");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null,"Email field can't be null");
                    txtemail.requestFocus();
                    return;
                }
                 
              }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (st != null)
                    st.close();
                if (con != null)
                    con.close();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        
     

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        try {

            if (!rs.isFirst()) {

                rs.previous();

                // Retrieve the values of the columns in the current row
                txtRegNo.setText(rs.getString("regno"));
                txtfirstname.setText(rs.getString("firstname"));
                txtlastname.setText(rs.getString("lastname"));
                txtusername.setText(rs.getString("username"));
                txtpassword.setText(rs.getString("password"));
                txtemail.setText(rs.getString("email"));
                txtphonenumber.setText(rs.getString("phonenumber"));
                String gender = rs.getString("gender");
                // Retrieve the date from the result set
                Date date = rs.getDate("dob");
                // Convert the java.sql.Date to java.util.Date
                Date date1 = new Date(date.getTime());

                // Set the date to the JDateChooser component
                txtdate.setDate(date1);
                switch (gender) {
                    case "Male":
                        rdmale.setSelected(true);
                        break;
                    case "Female":
                        rdfemale.setSelected(true);
                        break;
                    case "Others":
                        rdothers.setSelected(true);
                        break;
                    default:
                        break;
                }

                // move to the next record in the ResultSet
                // rs.previous();         
                // repeat the same code for the next record
                String nextGender = rs.getString("gender");
                switch (nextGender) {
                    case "Male":
                        rdmale.setSelected(true);
                        break;
                    case "Female":
                        rdfemale.setSelected(true);
                        break;
                    case "Others":
                        rdothers.setSelected(true);
                        break;
                    default:
                        break;

                }

                //String s81 = rs.getString("gender");
                //Date dob = rs.getDate("dob");
                String s = rs.getString("dob");
                txtdate.setToolTipText(s);
                //String jlabelimage1 = rs.getString("photo");
            }

            // Retrieve photo from its path
            String path2 = rs.getString(11);
            File file = new File(path2);
            BufferedImage image = ImageIO.read(file);

            // Resize image to fit in JLabel
            int width = jLabelphoto.getWidth();
            int height = jLabelphoto.getHeight();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Set image in JLabel
            jLabelphoto.setIcon(new ImageIcon(scaledImage));

        } catch (IOException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No Previous Data!");
            //ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            // Check if there is another row in the result set
            if (!rs.isLast()) {
                rs.next();
                // Retrieve the values of the columns in the current row
                txtRegNo.setText(rs.getString("regno"));
                txtfirstname.setText(rs.getString("firstname"));
                txtlastname.setText(rs.getString("lastname"));
                txtusername.setText(rs.getString("username"));
                txtpassword.setText(rs.getString("password"));
                txtemail.setText(rs.getString("email"));
                txtphonenumber.setText(rs.getString("phonenumber"));
                // Retrieve the date from the result set
                Date date = rs.getDate("dob");
                // Convert the java.sql.Date to java.util.Date
                Date date1 = new Date(date.getTime());

                String gender = rs.getString("gender");
                // Set the date to the JDateChooser component
                txtdate.setDate(date1);

                switch (gender) {
                    case "Male":
                        rdmale.setSelected(true);
                        break;
                    case "Female":
                        rdfemale.setSelected(true);
                        break;
                    case "Others":
                        rdothers.setSelected(true);
                        break;
                    default:
                        break;
                }

                // move to the next record in the ResultSet
                // repeat the same code for the next record
                String Gender = rs.getString("gender");
                switch (Gender) {
                    case "Male":
                        rdmale.setSelected(true);
                        break;
                    case "Female":
                        rdfemale.setSelected(true);
                        break;
                    case "Others":
                        rdothers.setSelected(true);
                        break;
                    default:
                        break;
                }

                // Retrieve photo from its path
                String path2 = rs.getString(11);
                File file = new File(path2);
                BufferedImage image = ImageIO.read(file);

                // Resize image to fit in JLabel
                int width = jLabelphoto.getWidth();
                int height = jLabelphoto.getHeight();
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                // Set image in JLabel
                jLabelphoto.setIcon(new ImageIcon(scaledImage));
            } else {
                JOptionPane.showMessageDialog(null, "No Next Record!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*  
            Retrieve photo from its path
String path2 = rs.getString(11);
File file = new File(path2);

// Load the image using JavaFX Image API in a background thread THE QUICKER FORMART
new Thread(() -> {
    try {
        Image image = new Image(file.toURI().toString());
        int width = jLabelphoto.getWidth();
        int height = jLabelphoto.getHeight();
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        // Update the JLabel on the main UI thread
        Platform.runLater(() -> {
            jLabelphoto.setIcon(new ImageIcon(SwingFXUtils.fromFXImage(image, null)));
        });
    } catch (Exception e) {
        e.printStackTrace();
    }
}).start();
        /*  
            Retrieve photo from its path
String path2 = rs.getString(11);
File file = new File(path2);

// Load the image using JavaFX Image API in a background thread THE QUICKER FORMART
new Thread(() -> {
    try {
        Image image = new Image(file.toURI().toString());
        int width = jLabelphoto.getWidth();
        int height = jLabelphoto.getHeight();
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        // Update the JLabel on the main UI thread
        Platform.runLater(() -> {
            jLabelphoto.setIcon(new ImageIcon(SwingFXUtils.fromFXImage(image, null)));
        });
    } catch (Exception e) {
        e.printStackTrace();
    }
}).start();
         */

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed

        try {
            rs.first();
            txtRegNo.setText(rs.getString(2));
            txtfirstname.setText(rs.getString(3));
            txtlastname.setText(rs.getString(4));
            txtusername.setText(rs.getString(5));
            txtpassword.setText(rs.getString(6));
            txtemail.setText(rs.getString(7));
            txtphonenumber.setText(rs.getString(8));
            // Retrieve the date from the result set
            Date date = rs.getDate("dob");
            // Convert the java.sql.Date to java.util.Date
            Date date1 = new Date(date.getTime());

            // Set the date to the JDateChooser component
            txtdate.setDate(date1);
            // String path2 = rs.getString(11);

            try {
                // Retrieve photo from its path
                String path2 = rs.getString(11);
                File file = new File(path2);
                BufferedImage image = ImageIO.read(file);

                // Resize image to fit in JLabel
                int width = jLabelphoto.getWidth();
                int height = jLabelphoto.getHeight();
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                // Set image in JLabel
                jLabelphoto.setIcon(new ImageIcon(scaledImage));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            String gender = rs.getString("gender");
            if (gender.equals("Male")) {
                rdmale.setSelected(true);
            } else if (gender.equals("Female")) {
                rdmale.setSelected(true);
            } else if (gender.equals("Others")) {
                rdmale.setSelected(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        try {
            rs.last();
            txtRegNo.setText(rs.getString(2));
            txtfirstname.setText(rs.getString(3));
            txtlastname.setText(rs.getString(4));
            txtusername.setText(rs.getString(5));
            txtpassword.setText(rs.getString(6));
            txtemail.setText(rs.getString(7));
            txtphonenumber.setText(rs.getString(8));
            // Retrieve the date from the result set
            Date date = rs.getDate("dob");
            // Convert the java.sql.Date to java.util.Date
            Date date1 = new Date(date.getTime());

            // Set the date to the JDateChooser component
            txtdate.setDate(date1);
            // String path2 = rs.getString(11);

            try {
                // Retrieve photo from its path
                String path2 = rs.getString(11);
                File file = new File(path2);
                BufferedImage image = ImageIO.read(file);

                // Resize image to fit in JLabel
                int width = jLabelphoto.getWidth();
                int height = jLabelphoto.getHeight();
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                // Set image in JLabel
                jLabelphoto.setIcon(new ImageIcon(scaledImage));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            String gender = rs.getString("gender");
            if (gender.equals("Male")) {
                rdmale.setSelected(true);
            } else if (gender.equals("Female")) {
                rdmale.setSelected(true);
            } else if (gender.equals("Others")) {
                rdmale.setSelected(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();

            query = "select * from student where regno='" + txtRegNo.getText() + "'";
            ResultSet rs = st.executeQuery(query);//this statement is used to excute the above query
            if (rs.first()) {
                txtRegNo.setText(rs.getString(2));
                txtfirstname.setText(rs.getString(3));
                txtlastname.setText(rs.getString(4));
                txtusername.setText(rs.getString(5));
                txtpassword.setText(rs.getString(6));
                txtemail.setText(rs.getString(7));
                txtphonenumber.setText(rs.getString(8));
                // Retrieve the date from the result set
                Date date = rs.getDate("dob");
                // Convert the java.sql.Date to java.util.Date
                Date date1 = new Date(date.getTime());

                // Set the date to the JDateChooser component
                txtdate.setDate(date1);
                
                // Retrieve photo from its path
                String path2 = rs.getString(11);
                File file = new File(path2);
                BufferedImage image = ImageIO.read(file);

                // Resize image to fit in JLabel
                int width = jLabelphoto.getWidth();
                int height = jLabelphoto.getHeight();
                Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

                // Set image in JLabel
                jLabelphoto.setIcon(new ImageIcon(scaledImage));

                String gender = rs.getString("gender");
                if (gender.equals("Male")) {
                    rdmale.setSelected(true);
                } else if (gender.equals("Female")) {
                    rdmale.setSelected(true);
                } else if (gender.equals("Others")) {
                    rdmale.setSelected(true);
                }
                JOptionPane.showMessageDialog(null, rs.getString("regno") + " " + rs.getString("firstname"));
                //After sving you might need to clear the previous content and get anothrr recod
            } else {
                JOptionPane.showMessageDialog(null, "Record not Found");
                //After sving you might need to clear the previous content and get anothrr recod
                //txtRegNo.setText("");
                //txtfirstname.setText("");
                //set focus to txtRegNo
                txtRegNo.requestFocus();
            }

            //txtRegNo.setText("");
            //txtfirstname.setText("");
            //set focus to txtRegNo
            //txtRegNo.requestFocus();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
       /* JFileChooser fileChooser = new JFileChooser();
int result = fileChooser.showOpenDialog(null);
String selectedImagePath;
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    selectedImagePath = selectedFile.getAbsolutePath();
} else {
    selectedImagePath = path;
}*/
        
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

            Image image = ii.getImage().getScaledInstance(jLabelphoto.getWidth(), jLabelphoto.getHeight(), Image.SCALE_SMOOTH);
            //jlabelimage
            jLabelphoto.setIcon(new ImageIcon(image));
        }
        else {
            
        //String notselected=selectedImagePath;
       
        
         try {
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();

            query = "select photo from student ";
            ResultSet rs = st.executeQuery(query);
            String logicalpath = rs.getString(11);
            
        
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
            }} /*
        JFileChooser browseImageFile = new JFileChooser();
// Filter image extensions
FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
browseImageFile.addChoosableFileFilter(fnef);
int showOpenDialogue = browseImageFile.showOpenDialog(null);

if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
    File selectedImageFile = browseImageFile.getSelectedFile();
    String selectedImagePath = selectedImageFile.getAbsolutePath();
    JOptionPane.showMessageDialog(null, selectedImagePath);

    // Replace backslashes (\) with forward slashes (/) in the file path
    selectedImagePath = selectedImagePath.replace("\\", "/");

    // Display image on jlabel
    ImageIcon ii = new ImageIcon(selectedImagePath);
    // Resize image to fit jlabel
    Image image = ii.getImage().getScaledInstance(jLabelphoto.getWidth(), jLabelphoto.getHeight(), Image.SCALE_SMOOTH);
    jLabelphoto.setIcon(new ImageIcon(image));

    // Store the file path in the database
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO mytable (image_path) VALUES (?)");
        ps.setString(1, selectedImagePath);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Image path stored in database.");
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
         */
    }//GEN-LAST:event_btnuploadActionPerformed

    private void txtphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumberActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Marks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            StudClassReport reporting = new StudClassReport();
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            // TODO add your handling code here:
            StudMarksReport reporting = new StudMarksReport();
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new HM_Window().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem5HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jMenuItem5HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5HierarchyChanged

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        StudMaleReport reporting = new StudMaleReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        StudFemaleReport reporting = new StudFemaleReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        StudentTermlyReport reporting = new StudentTermlyReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }
      this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminstratorStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminstratorStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminstratorStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminstratorStud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminstratorStud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnsignup;
    private javax.swing.JButton btntDelete;
    private javax.swing.JButton btnupload;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabelphoto;
    private javax.swing.JLabel jLabeltime;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelimage;
    private javax.swing.JRadioButton rdfemale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JRadioButton rdothers;
    private javax.swing.JTextField txtRegNo;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private static class dateChooser {

        private static void setDate(Date utilDate) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public dateChooser() {
        }
    }
    String selectedImagePath;
}
