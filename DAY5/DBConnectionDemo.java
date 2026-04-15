import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;*/

public class DBConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3309/studentdb";
        String user = "root";
        String password = "pass";

        try {
            // Optional in newer versions, but safe
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");

            con.close();
            System.out.println("\nConnection closed.");
        } catch (Exception e) {
            e.printStackTrace(); // better debugging
        }
    }
}