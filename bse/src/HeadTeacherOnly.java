import com.itextpdf.text.DocumentException;
import java.awt.BorderLayout;
import java.awt.Image;
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HeadTeacherOnly extends javax.swing.JFrame {
    int count;
    String s7;
    
    String gender;
    
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
   
   private final Timer timer;
   private final SimpleDateFormat sdf;
   
    public HeadTeacherOnly() {
        con = null;
       st = null;
       statement = null;
       
        cs ="jdbc:mysql://localhost:3306/mydb";//use ds connectivity,from localhost,port that the server its running
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

    public void Main(){
       try {
           Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from teacher");
            
             
       } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
       
}
     private JLabel imageLabel;

    public HeadTeacherOnly(String imagePath) {
        super("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new label to display the image
        imageLabel = new JLabel();

        // Load the image from the specified filepath
        ImageIcon image = new ImageIcon(imagePath);

        // Set the image as the icon of the label
        imageLabel.setIcon(image);

        // Add the label to the frame
        getContentPane().add(imageLabel, BorderLayout.CENTER);

        // Resize the frame to fit the image
        pack();

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Show the frame
        setVisible(true);
        timer=null;
        sdf=null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        rdmale = new javax.swing.JRadioButton();
        rdfemale = new javax.swing.JRadioButton();
        rdothers = new javax.swing.JRadioButton();
        btnr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnupload = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btntDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtphonenumber = new javax.swing.JTextField();
        txtdate = new com.toedter.calendar.JDateChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelphoto = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabeltime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HEAD OF THE SCHOOL'S WING");
        setFont(new java.awt.Font("Agency FB", 3, 36)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        buttonGroup1.add(rdmale);
        rdmale.setText("Male");

        buttonGroup1.add(rdfemale);
        rdfemale.setText("Female");

        buttonGroup1.add(rdothers);
        rdothers.setText("Others");

        btnr.setText("RADIO");
        btnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrActionPerformed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText(" WELCOME TO THE HEAD TR ADMINSTRATORS  PAGE");

        jLabel13.setBackground(new java.awt.Color(0, 51, 51));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("           In this page you are free to manage school's information accordingly");

        jLabel9.setBackground(new java.awt.Color(0, 51, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Bank Account No");

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Surname Name");

        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });

        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(" UserName");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Password");

        jLabel10.setBackground(new java.awt.Color(255, 255, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("Choose your photo to be uploaded------>");

        btnupload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupload.setText("Upload");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(0, 0, 255));
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLast.setForeground(new java.awt.Color(0, 0, 255));
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFind.setForeground(new java.awt.Color(0, 0, 255));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(0, 0, 255));
        btnPrevious.setText("Privious");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(0, 0, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btntDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btntDelete.setForeground(new java.awt.Color(0, 0, 255));
        btntDelete.setText("Delete");
        btntDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntDeleteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Press signup here ----->");

        btnregister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtphonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenumberActionPerformed(evt);
            }
        });

        txtdate.setDateFormatString(" dd - MM - yyyy");

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(208, 212));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(208, 212));

        jDesktopPane1.setLayer(jLabelphoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelphoto, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelphoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("check no_of Students recorded so far");

        jLabeltime.setBackground(new java.awt.Color(51, 51, 51));
        jLabeltime.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabeltime, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeltime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnupload, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnr)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(rdmale)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rdfemale)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rdothers))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(btntDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jButton3))))
                                                .addGap(18, 18, 18)
                                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtRegNo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtlastname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdothers)
                            .addComponent(rdmale)
                            .addComponent(rdfemale)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnr)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btntDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupload, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu2.setText("Manage");

        jMenuItem2.setText("Students");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Teachers");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Adminstrators");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Other Privillages");

        jMenuItem5.setText("Term Results Reporrt");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Student Marks");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Class Attendence");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Male Report");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Female Report");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Teachers report");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrActionPerformed

        if (rdmale.isSelected()==true) {
            gender = "Male";
            JOptionPane.showMessageDialog(null, gender+" is selected");

        }
        else if (rdfemale.isSelected()==true) {
            gender = "Female";
            JOptionPane.showMessageDialog(null, gender+" is selected");

        }
        else if (rdothers.isSelected()==true) {
            gender = "Others";
            JOptionPane.showMessageDialog(null, gender+" is selected");

        }
        else{
           JOptionPane.showMessageDialog(null, "Select the gender");
        }
    }//GEN-LAST:event_btnrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new AdminLogIn().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

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
             
            
             JOptionPane.showMessageDialog(null, selectedImagePath);
              // Display image on jlabel
             ImageIcon ii = new ImageIcon(selectedImagePath);
             // Resize image to fit jlabel

             Image image = ii.getImage().getScaledInstance(jLabelphoto.getWidth(), jLabelphoto.getHeight(), Image.SCALE_SMOOTH);

             jLabelphoto.setIcon(new ImageIcon(image));
         }
    }//GEN-LAST:event_btnuploadActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try{
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
        
            String gender =rs.getString("gender");
            if(gender.equals("Male")){
                rdmale.setSelected(true);
            }
            else if(gender.equals("Female")){
                rdmale.setSelected(true);
            }
            else if(gender.equals("Others")){
                rdmale.setSelected(true);
            }
        }
        catch(SQLException ex){ex.printStackTrace();
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
         try{
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
            
            
            String gender =rs.getString("gender");
            if(gender.equals("Male")){
                rdmale.setSelected(true);
            }
            else if(gender.equals("Female")){
                rdmale.setSelected(true);
            }
            else if(gender.equals("Others")){
                rdmale.setSelected(true);
            }
        }
        catch(SQLException ex){ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");// this is a statement that regesters a driver(connector)
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();

            query = "select * from teacher where accountno='"+txtRegNo.getText()+"'";
            ResultSet rs =st.executeQuery(query);//this statement is used to excute the above query
            if (rs.first()){
                txtRegNo.setText(rs.getString("accountno"));
                txtfirstname.setText(rs.getString("firstname"));
                txtlastname.setText(rs.getString(4));
                txtusername.setText(rs.getString(5));
                txtpassword.setText(rs.getString(6));
                txtemail.setText(rs.getString(7));
                txtphonenumber.setText(rs.getString(8));

                String gender =rs.getString("gender");
                if(gender.equals("Male")){
                    rdmale.setSelected(true);
                }
                else if(gender.equals("Female")){
                    rdmale.setSelected(true);
                }
                else if(gender.equals("Others")){
                    rdmale.setSelected(true);
                }
                JOptionPane.showMessageDialog(null,rs.getString("firstname")+" "+rs.getString("lastname"));
                //After sving you might need to clear the previous content and get anothrr recod
            }
            else{
                JOptionPane.showMessageDialog(null,"Record not Found");
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
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        try {
            if (rdmale.isSelected()) {
                gender = "Male";
            } else if (rdfemale.isSelected()) {
                gender = "Female";
            } else if (rdothers.isSelected()) {
                gender = "Others";
                System.out.println(gender);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a gender.");
                return;
            }

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();
            String query1 = "SELECT * FROM teacher WHERE accountno = '"+txtRegNo.getText()+"'";
            rs = st.executeQuery(query1);
            if (rs.first() && rs.getString("accountno").equals(txtRegNo.getText())) {
                query = "UPDATE student SET firstname = '"+txtfirstname.getText()+"',lastname ='"+txtlastname.getText()+"',username ='"+txtusername.getText()+"',dob='"+txtdate.getDate()+"',gender='"+gender+"',phonenumber='"+txtphonenumber.getText()+"',email='"+txtemail.getText()+"' WHERE Regno = '"+txtRegNo.getText()+"'";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Edited");
            }
            else {
                JOptionPane.showMessageDialog(null, "Edit failed, Record not found");
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
        try{

            if(!rs.isFirst()){

                rs.previous();

                // Retrieve the values of the columns in the current row
                txtRegNo.setText(rs.getString("accountno"));
                txtfirstname.setText(rs.getString("firstname"));
                txtlastname.setText(rs.getString("lastname"));
                txtusername.setText(rs.getString("username"));
                txtpassword.setText(rs.getString("password"));
                txtemail.setText(rs.getString("email"));
                txtphonenumber.setText(rs.getString("phonenumber"));
                String gender =rs.getString("gender");
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
                String s=rs.getString("dob");
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
        
       
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No Previous Data!");
            //ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            // Check if there is another row in the result set
            if(!rs.isLast()){
                rs.next();
                // Retrieve the values of the columns in the current row
                txtRegNo.setText(rs.getString("accountno"));
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
                
                 String gender =rs.getString("gender");
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
                }         
            else{
                JOptionPane.showMessageDialog(null,"No Next Record!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminstratorStud.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btntDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntDeleteActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();

            String query1 = "SELECT * FROM teacher WHERE accountno = '"+txtRegNo.getText()+"'";
            rs = st.executeQuery(query1);
            if (rs.first() && rs.getString("accountno").equals(txtRegNo.getText())) {
                query = "DELETE FROM student WHERE accountno = '"+txtRegNo.getText()+"'";
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
            }
            else {
                JOptionPane.showMessageDialog(null, "not deleted, record not found");
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
    }//GEN-LAST:event_btntDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtRegNo.setText("");
        txtfirstname.setText("");
        txtlastname.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtemail.setText("");
        txttotal.setText("");
        txtphonenumber.setText("");
        txtdate.setDate(null);
        //txtdate.cleanup();
        rdmale.setSelected(false);
        rdfemale.setSelected(false);
        txtfirstname.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
      try {

            if (rdmale.isSelected()==true) {
            gender = "Male";
            }
            else if (rdfemale.isSelected()==true) {
                gender = "Female";
            }
            else if (rdothers.isSelected()==true) {
                gender = "Others";
                
            }
            else{
               JOptionPane.showMessageDialog(null, "Select the gender");
               return;
            }

        String regNo = txtRegNo.getText().trim();
        String firstName = txtfirstname.getText().trim();
        String lastName = txtlastname.getText().trim();
        String username = txtusername.getText().trim();
        String password = txtpassword.getText().trim();
        String email = txtemail.getText().trim();
        String phoneNumber = txtphonenumber.getText().trim();
        String photo = selectedImagePath;
        Date selectedDate = txtdate.getDate();
        // Convert the date to a string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dob = dateFormat.format(selectedDate);
            
        if (regNo.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Reg Number's field can't be null");
            txtRegNo.requestFocus();
            return;
        } else if (firstName.isEmpty()) {
            JOptionPane.showMessageDialog(null,"First name field can't be null");
            txtfirstname.requestFocus();
            return;
        } else if (lastName.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Last Name field can't be null");
            txtlastname.requestFocus();
            return;
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Password field can't be null");
            txtpassword.requestFocus();
            return;
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Email field can't be null");
            txtemail.requestFocus();
            return;
        } else if (gender.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Select your Gender to proceed");
            return;
        } else if (phoneNumber.isEmpty() || !phoneNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null,"Phone Number field can't be null and must contain only digits");
            txtphonenumber.requestFocus();
            return;
        } else if (selectedDate == null) {
            JOptionPane.showMessageDialog(null,"Please select a date of birth.");
            return;
        }

        // Use a prepared statement to insert the data into the database
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(cs, "root", "");
        String query = "INSERT INTO teacher (accountno, firstname, lastname, username, password, email, phonenumber, dob, gender, photo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        JOptionPane.showMessageDialog(null,"Your account has been successfully created");
        } catch(SQLException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        try {
            if (statement != null) {
                statement.close();
            }
            if (con != null) {
                con.close();
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }}
      
               
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumberActionPerformed

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
            String countQuery = "SELECT COUNT(*) FROM teacher";
            ResultSet resultSet = statement.executeQuery(countQuery);

            // Retrieve the result
            resultSet.next();
            count = resultSet.getInt(1);
            //String total = String.valueOf(count);
            txttotal.setText(Integer.toString(count));
            
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

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new student().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         StudentTermlyReport reporting = new StudentTermlyReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         StudMarksReport reporting = new StudMarksReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
      this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        StudClassReport reporting = new StudClassReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
      this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        StudMaleReport reporting = new StudMaleReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
      this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        StudFemaleReport reporting = new StudFemaleReport();
        try {
            reporting.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
      this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Teachers_Reporting report = new Teachers_Reporting();
        try {
            report.Main();
        } catch (DocumentException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HeadTeacherOnly.class.getName()).log(Level.SEVERE, null, ex);
        }
      this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(HeadTeacherOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeadTeacherOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeadTeacherOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeadTeacherOnly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HeadTeacherOnly().setVisible(true);
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
    private javax.swing.JButton btnr;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btntDelete;
    private javax.swing.JButton btnupload;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JMenuItem jMenuItem10;
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
}
