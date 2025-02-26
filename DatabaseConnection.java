import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Database Details
        String host = "smcse-stuproj00.city.ac.uk";
        String port = "3306";  //MySQL port
        String dbName = "<in2033t02>"; 
        String user = "<in2033t02_a>"; 
        String password = "<wceWZykvyss>"; 

        // Connection URL
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?user=" + user + "&password=" + password;

        try {
            //connection to the database
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connected to the database!");

            // Our database operations can go here 

            // Clsoing connection when done 
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
