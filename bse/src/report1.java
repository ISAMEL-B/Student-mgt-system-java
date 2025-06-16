
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
public class report1 {
   
    Connection con;
PreparedStatement statement;
Statement st;
String cs;
String user;
String password;
String query;
ResultSet rs;
String records;
public static final String RESULT = "Class_report.pdf";

report1(){
    con = null;
        st = null;
        statement = null;
        cs = "jdbc:mysql://localhost:3306/mydb";//registers the driver
        user = "root";
        password = "";
      
}   

public void Main() throws DocumentException, IOException{
     Document document = new Document(PageSize.A5.rotate());
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        document.open();
        PdfPTable table = new PdfPTable(8);
         try{
            Class.forName("com.mysql.jdbc.Driver");//register driver
            con = DriverManager.getConnection(cs,user,password);
            
               st = con.createStatement();//creates the statement 
               query = "select * from student";
                rs = st.executeQuery(query);//gets a rs and puts a file handler at the bors
                table.addCell("NO");
                table.addCell("REG NUMBER");
                table.addCell("FIRST NAME");
                table.addCell("LAST NAME");
                table.addCell("PHONE NUMBER");
                table.addCell("EMAIL ADDRESS");
                table.addCell("GENDER");
                table.addCell("DATE OF BIRTH");
                while(rs.next()){
                table.addCell(rs.getString("id"));  
                table.addCell(rs.getString("regno"));
                table.addCell(rs.getString("firstname"));
                table.addCell(rs.getString("lastname")); 
                table.addCell(rs.getString("phonenumber"));
                table.addCell(rs.getString("email"));
                table.addCell(rs.getString("gender"));               
                table.addCell(rs.getString("dob"));
           
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
            File myfile = new File("Class_report.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
        document.close();
    }
public static void main(String []args) throws DocumentException, IOException{
        report1 report = new report1();
        report.Main();
}
}
