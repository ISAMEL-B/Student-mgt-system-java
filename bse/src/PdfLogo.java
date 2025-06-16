import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISAMEL K NAVIE
 */
public class PdfLogo {
    Connection con;
PreparedStatement statement;
Statement st1;
Statement st2;
String cs;
String user;
String password;
String query1;
String query2;
ResultSet rs1;
ResultSet rs2;
String records;
public static final String RESULT = "pdflogo.pdf";
PdfLogo(){
    con = null;
        st1 = null;
        st2 = null;
        statement = null;
        cs = "jdbc:mysql://localhost:3306/mydb";//registers the driver
        user = "root";
        password = "";
      
}   

 public void Main() throws DocumentException, IOException{
    Document document = new Document(PageSize.A5.rotate());
    PdfWriter.getInstance(document, new FileOutputStream(RESULT));
    document.open();
    
    // Add school logo
    Image logo = Image.getInstance("D:\\codinex.jpeg");
    logo.scaleToFit(100f, 100f); // adjust the size of the logo
    Paragraph logoParagraph = new Paragraph();
    logoParagraph.add(new Chunk(logo, 0, 0, true));
    logoParagraph.setAlignment(Element.ALIGN_LEFT);
    document.add(logoParagraph);

    // Add school title
    Paragraph titleParagraph = new Paragraph();
    titleParagraph.add(new Chunk("School Name", new Font(Font.FontFamily.HELVETICA, 16)));
    titleParagraph.setAlignment(Element.ALIGN_CENTER);
    document.add(titleParagraph);
    
    PdfPTable table = new PdfPTable(8);
    // set table width to 100%
    table.setWidthPercentage(100); 
    // set column widths as absolute values in points
    float[] columnWidths = {10, 30, 20, 20, 25, 25, 15,15};
    table.setWidths(columnWidths);
    try{
       Class.forName("com.mysql.jdbc.Driver");//register driver
            con = DriverManager.getConnection(cs,user,password);           
               st1 = con.createStatement();//creates the statement 
               query1 = "select * from student";
               rs1 = st1.executeQuery(query1);//gets a rs1 and puts a file handler at the bors
               
               st2 = con.createStatement();//creates the statement 
               query2 = "select * from marks";               
                 rs2 = st2.executeQuery(query2);//gets a rs2 and puts a file handler at the bors
                table.addCell("NO");
                table.addCell("REG NUMBER");
                table.addCell("FIRST NAME");
                table.addCell("LAST NAME");
                table.addCell("MATHEMATICS");
                table.addCell("SCIENCE");
                table.addCell("ENGLISH");
                table.addCell("SST");
                while(rs1.next()&&rs2.next()){
                table.addCell(rs1.getString("id"));  
                table.addCell(rs1.getString("regno"));
                table.addCell(rs1.getString("firstname"));
                table.addCell(rs1.getString("lastname")); 
               
                table.addCell(rs2.getString("maths"));
                table.addCell(rs2.getString("science"));
                table.addCell(rs2.getString("english"));               
                table.addCell(rs2.getString("sst"));
                 
                }
                document.add(table);
        }
         
         catch (SQLException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }//finally removed
     
 if(Desktop.isDesktopSupported()){
        try{
            File myfile = new File("pdflogo.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
        document.close();
        if (Desktop.isDesktopSupported()) {
}
    }
    public static void main (String []args) throws Exception {
      StudMarksReport reporting = new StudMarksReport();
      reporting.Main();
      
}

}