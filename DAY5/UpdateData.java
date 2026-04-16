import java.sql.*;
import java.util.Scanner;

public class UpdateData{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3309/studentdb";
        String user="root";
        String password ="pass";

        Scanner sc = new Scanner(System.in);

        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully.");

            System.out.print("Enter the id for updation : ");
            int Id =sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the new marks: "); //here we have fixed the coloumn that is being updated  can make it dynamic though !
            int mar =sc.nextInt();

            String query = "UPDATE students SET mar=?  WHERE Id = ?";
            PreparedStatement ps = con.prepareStatement(query);
           
            ps.setInt(1, mar);
            ps.setInt(2, Id);
             // Step 5: Execute update
            int rowsAffected = ps.executeUpdate(); //executeUpdate executes actions and returns the count of row that are affected

            // Step 6: Show result
            if (rowsAffected > 0) {
                System.out.println(" Data updated successfully!");
            } else {
                System.out.println("No record found with ID Entered");
            }
            ps.close();
            con.close();
            sc.close(); // Step 7: Close resources

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

