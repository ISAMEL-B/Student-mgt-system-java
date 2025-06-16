import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
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

public class StudFemaleReport {

    Connection con;
    PreparedStatement statement;
    Statement st;
    String cs;
    String user;
    String password;
    String query;
    ResultSet rs;
    String records;

    StudFemaleReport() {
        con = null;
        st = null;
        statement = null;
        cs = "jdbc:mysql://localhost:3306/mydb";//registers the driver
        user = "root";
        password = "";

    }

    public static final String RESULT = "Female_Class_Members.pdf";

    public void Main() throws DocumentException, IOException {
        Document document = new Document(PageSize.A4.rotate());
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        document.open();
        PdfPTable table = new PdfPTable(8);
        // set table width to 100%
        table.setWidthPercentage(100);
        // set column widths as absolute values in points
        float[] columnWidths = {10, 30, 30, 20, 25, 40, 15, 20};
        table.setWidths(columnWidths);
        Image img = Image.getInstance("budge i.jpg");
        img.scaleToFit(700, 100);
        document.add(img);
        document.add(new Paragraph("BRAINS VILLE SCHOOL\nPO BOX 1021\nISINGIRO-UG", FontFactory.getFont(FontFactory.TIMES_BOLD, 12)));
        document.add(new Paragraph("FEMALE STUDENTS IN THE CLASS REPORT", FontFactory.getFont(FontFactory.TIMES_BOLD, 20)));
        document.add(new Paragraph("     "));
        try {
            PdfContentByte cb = writer.getDirectContent();
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            cb.setFontAndSize(bf, 15);
            cb.beginText();
            cb.setTextMatrix(img.getScaledWidth() + 10, img.getScaledHeight() / 5 - 6);
            cb.showText("P.O. Box 100");
            cb.endText();
        } catch (Exception e) {
            e.printStackTrace();
        
}
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(cs,user,password);
        st = con.createStatement();
        query = "select * from student where gender = 'Female'";
        rs = st.executeQuery(query);
        table.addCell("NO");
        table.addCell("REG NUMBER");
        table.addCell("FIRST NAME");
        table.addCell("LAST NAME");
        table.addCell("PHONE NO");
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
        document.add(new Paragraph("For Officials only\n", FontFactory.getFont(FontFactory.TIMES_BOLD, 15)));
        document.add(new Paragraph("             Signiture: .......................", FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
        document.add(new Paragraph("             Name: .............................", FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
        document.add(new Paragraph("\"EDUCATION IS THE KEY TO SUCCESS\"", FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
    } catch (SQLException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        if (rs != null)
//finally removed
     
 if(Desktop.isDesktopSupported()){
        try{
            File myfile = new File("Female_Class_Members.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){}
        }
        document.close();
        if (Desktop.isDesktopSupported()) {
    try {
        File file = new File(RESULT);
        Desktop.getDesktop().open(file);
    } catch (IOException ex) {
        // handle the exception
    }
}
    }}
    public static void main (String []args) throws Exception {
      StudFemaleReport reporting = new StudFemaleReport();
      reporting.Main();
      
}

}

