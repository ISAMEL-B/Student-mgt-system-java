import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Teachers_Reporting {
    Connection con;
PreparedStatement statement;
Statement st;
String cs;
String user;
String password;
String query;
ResultSet rs;
String records;
public static final String RESULT = "Teachers_Report.pdf";

Teachers_Reporting(){
    con = null;
        st = null;
        statement = null;
        cs = "jdbc:mysql://localhost:3306/mydb";//registers the driver
        user = "root";
        password = "";
      
}   

public void Main() throws DocumentException, IOException{
    
     Document document = new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        document.open();
        PdfPTable table = new PdfPTable(8);
         try {
            PdfWriter.getInstance(document, new FileOutputStream(RESULT));//Need to write in a table
        } catch (DocumentException ex1) {

        }
        document.open();
        Image img = null;
        try {
            img = Image.getInstance("budge i.jpg");
          
        img.scaleToFit(500, 100);
            document.add(img);
            document.add(new Paragraph("BRAINS VILLE SCHOOL\nPO BOX 1021\nISINGIRO-UG", FontFactory.getFont(FontFactory.TIMES_BOLD, 12)));
            document.add(new Paragraph("                NUMBER OF TEACHERS REPORT", FontFactory.getFont(FontFactory.TIMES_BOLD, 20)));
            document.add(new Paragraph(" "));
            Class.forName("com.mysql.jdbc.Driver");//register driver
            con = DriverManager.getConnection(cs,user,password);
            
               st = con.createStatement();//creates the statement 
               query = "select * from teacher";
                rs = st.executeQuery(query);//gets a rs and puts a file handler at the bors
                table.addCell("NO");
                table.addCell("ACCOUNT NO");
                table.addCell("FIRST NAME");
                table.addCell("LAST NAME");
                table.addCell("PHONE NO");
                table.addCell("EMAIL");
                table.addCell("GENDER");               
                table.addCell("DOB");
                while(rs.next()){
                table.addCell(rs.getString("id"));
                table.addCell(rs.getString("accountno"));
                table.addCell(rs.getString("firstname"));   
                table.addCell(rs.getString("lastname")); 
                table.addCell(rs.getString("phonenumber"));
                table.addCell(rs.getString("email"));
                table.addCell(rs.getString("gender"));               
                table.addCell(rs.getString("dob"));
                }
                document.add(table);
           try {
            document.add(new Paragraph("For Officials only\n", FontFactory.getFont(FontFactory.TIMES_BOLD, 15)));
            document.add(new Paragraph("             Signiture  ......................", FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
            document.add(new Paragraph("             Name  ...........................", FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
            document.add(new Paragraph("\"EDUCATION IS THE KEY TO SUCCESS\"", FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
            } catch (DocumentException ex) {
                Logger.getLogger(StudentTermlyReport.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
         catch (SQLException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }//finally removed
     
 if(Desktop.isDesktopSupported()){
        try{
            File myfile = new File("Teachers_Report.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
        document.close();
    }

public static void main (String []args) throws Exception {
      Teachers_Reporting report = new Teachers_Reporting();
      report.Main();
}
}
