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
import java.io.FileNotFoundException;
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

/**
 *
 * @author ISAMEL K NAVIE
 */
public class StudentTermlyReport {
  

    
Connection con;
PreparedStatement statement;
Statement st1;
Statement st2;
String cs;
String user;
String password;
String query1,query2;
ResultSet rs1,rs2;
String records;
StudentTermlyReport(){
        con = null;
        st1 = null;
        st2 = null;
        statement = null;
        cs = "jdbc:mysql://localhost:3306/mydb";//registers the driver
        user = "root";
        password = "";
}
public static final String Report = "Class_Termly_Report.pdf";
    
    public void Main() throws DocumentException, IOException{
     Document document = new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document, new FileOutputStream(Report));
        document.open();
        PdfPTable table = new PdfPTable(10);
        // set table width to 100%
        table.setWidthPercentage(100); 
         // set column widths as absolute values in points
        float[] columnWidths = {10, 30, 20, 20, 25, 25, 15,15,15,15};
        table.setWidths(columnWidths);
       
        try {
            PdfWriter.getInstance(document, new FileOutputStream(Report));//Need to write in a table
        } catch (DocumentException ex1) {

        } catch (FileNotFoundException ex2) {
            Logger.getLogger(StudentTermlyReport.class.getName()).log(Level.SEVERE, null, ex2);
        }
        document.open();
        Image img = null;
        try {
            img = Image.getInstance("budge i.jpg");
          } catch (BadElementException ex3) {
            Logger.getLogger(StudentTermlyReport.class.getName()).log(Level.SEVERE, null, ex3);
        } catch (IOException ex4) {
            Logger.getLogger(StudentTermlyReport.class.getName()).log(Level.SEVERE, null, ex4);
        }
        img.scaleToFit(500, 100);
        try {
            document.add(img);
             document.add(new Paragraph("BRAINS VILLE SCHOOL\nPO BOX 1021\nISINGIRO-UG", FontFactory.getFont(FontFactory.TIMES_BOLD, 12)));
             document.add(new Paragraph("END OF TERM RESULTS", FontFactory.getFont(FontFactory.TIMES_BOLD, 20)));
            document.add(new Paragraph("     "));
            
            Class.forName("com.mysql.jdbc.Driver");//register driver
            con = DriverManager.getConnection(cs,user,password);           
               st1 = con.createStatement();//creates the statement 
               query1 = "select * from student";
               rs1 = st1.executeQuery(query1);//gets a rs1 and puts a file handler at the bors
               
               //creates the statement 
               st2 = con.createStatement();
               query2 = "select * from results";               
               rs2 = st2.executeQuery(query2);//gets a rs2 and puts a file handler at the bors
                table.addCell("NO");
                table.addCell("REG NUMBER");
                table.addCell("FIRST NAME");
                table.addCell("LAST NAME");
                table.addCell("MATHS");
                table.addCell("SCIENCE");
                table.addCell("ENGLISH");
                table.addCell("SST");
                table.addCell("TOTAL");
                table.addCell("DIV");
                while(rs1.next()&&rs2.next()){
                table.addCell(rs1.getString("id"));  
                table.addCell(rs1.getString("regno"));
                table.addCell(rs1.getString("firstname"));
                table.addCell(rs1.getString("lastname")); 
               
                table.addCell(rs2.getString("maths"));
                table.addCell(rs2.getString("science"));
                table.addCell(rs2.getString("english"));               
                table.addCell(rs2.getString("sst"));
                table.addCell(rs2.getString("total"));               
                table.addCell(rs2.getString("division"));
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
            File myfile = new File("Class_Termly_Report.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
        document.close();
        if (Desktop.isDesktopSupported()) {
}
    }
    public static void main (String []args) throws Exception {
      StudentTermlyReport reporting = new StudentTermlyReport();
      reporting.Main();
      
}

}
