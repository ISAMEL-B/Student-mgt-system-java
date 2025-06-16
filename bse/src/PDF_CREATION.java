import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


 class PDF_CLASS {
    Connection con;
PreparedStatement statement;
Statement st;
String cs;
String user;
String password;
String query;
ResultSet rs;
String records;
public static final String RESULT = "Isamel's DB Table.pdf";

PDF_CLASS(){
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
        PdfPTable table = new PdfPTable(3);
        // set table width to 100%
        table.setWidthPercentage(100); 
         // set column widths as absolute values in points
        float[] columnWidths = {10, 20, 20};
        table.setWidths(columnWidths);
         try{
            Class.forName("com.mysql.jdbc.Driver");//register driver
            con = DriverManager.getConnection(cs,user,password);
            
               st = con.createStatement();//creates the statement 
               query = "select * from student";
                rs = st.executeQuery(query);//gets a rs and puts a file handler at the bors
                table.addCell("ID");
                table.addCell("REG NUMBER");
                table.addCell("NAME");
                while(rs.next()){
                    table.addCell(rs.getString("id"));
                    table.addCell(rs.getString("regno"));
                    table.addCell(rs.getString("firstname"));   
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
            File myfile = new File("Isamel's DB Table.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
        document.close();
    }
}

