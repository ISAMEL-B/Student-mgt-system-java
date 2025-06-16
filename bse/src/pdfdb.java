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

public class pdfdb {
  static Connection con;
  static PreparedStatement statement;
  static Statement st;
  static String cs;
  static String user;
  static String password;
  static String query;
  static ResultSet rs;
  static String records;
   
    public pdfdb() {
       con = null;
       st = null;
       statement = null;
        cs ="jdbc:mysql://localhost:3306/mydb";//use ds connectivity,from localhost,port that the server its running
//at the database name(bse) 
user = "root";
password = "";

}

public static final String RESULT = "HitTable.pdf";

public static void main(String [] args) throws DocumentException, IOException {
    	// step 1
        Document document = new Document(PageSize.A5.rotate());
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
        document.open();
        // step 4
        PdfPTable table = new PdfPTable(2);
        
        // a long phrase
        Phrase p = new Phrase("Dr. iText or: How I Learned to Stop Worrying and Love PDF.");
        PdfPCell cell = new PdfPCell(p);
        // the prhase is wrapped
        table.addCell("wrap");
        cell.setNoWrap(false);
        table.addCell(cell);
        
        
        // the phrase isn't wrapped
        table.addCell("no wrap");
        cell.setNoWrap(true);
        table.addCell(cell);
        // a long phrase with newlines
        p = new Phrase(
            "Dr. iText or:\nHow I Learned to Stop Worrying\nand Love PDF.");
        cell = new PdfPCell(p);
        // the phrase fits the fixed height
        table.addCell("fixed height (more than sufficient)");
        cell.setFixedHeight(72f);
        table.addCell(cell);
        // the phrase doesn't fit the fixed height
        table.addCell("fixed height (not sufficient)");
        cell.setFixedHeight(36f);
        table.addCell(cell);
        // The minimum height is exceeded
        table.addCell("minimum height");
        cell = new PdfPCell(new Phrase("Dr. iText"));
        cell.setMinimumHeight(36f);
        table.addCell(cell);
        // The last row is extended
        table.setExtendLastRow(true);
        table.addCell("extend last row");
        table.addCell(cell);
        document.add(table);
        
        ////////open the file//////////
        if(Desktop.isDesktopSupported()){
        try{
            File myfile = new File("HitTable.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
      
        // step 5/////////////////
        document.close();    
        
        try{
            query ="select * from student";
            rs =st.executeQuery(query);
            boolean nobse = true;
            while(rs.next()){
                if (rs.getString("regno").contains("bse")){
                    table.addCell(rs.getString("id"));
                    table.addCell(rs.getString("regno"));
                    table.addCell(rs.getString("name"));
                    nobse = false;
                    }
                
                }
            if (nobse){
                JOptionPane.showMessageDialog(null, "Nothing here");
                return;
            }
            document.add(table);            
            }
    catch(SQLException ex){ex.printStackTrace();
            }

        }

    }
