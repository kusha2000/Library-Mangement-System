import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
public static Connection ConnectorDb(){
    try {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:LibraryNew.sqlite");
        return conn;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
   
    }  
        
}   
    
}
