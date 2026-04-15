import java.sql.*;
import java.util.Scanner;

public class EntryDataDemo{

    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3309/studentdb";
        String user ="root";
        String password="pass";

        Scanner sc = new Scanner(System.in);


        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!!");

             //create statement 
           // Statement st=con.createStatement(); as we didn't used it !! idk why we use it in first place
            
           System.out.print("Enter ID: ");
            int Id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String Name = sc.nextLine();
            

            System.out.print("Enter Section:");
            String sec =sc.nextLine();

            System.out.print("Enter marks :");
            int mar=sc.nextInt();
            

           

           //-----------------------------------------------------------------------insert--------------------------------------------------------
        
            String insertquery ="INSERT INTO students VALUES(?, ?, ?, ?)";

            PreparedStatement ps =con.prepareStatement(insertquery);
            ps.setInt(1,Id);
            ps.setString(2,Name);
            ps.setString(3,sec);
            ps.setInt(4,mar);
            int result =ps.executeUpdate();

            //Execute query
            //st.executeUpdate(insertquery);
            
            

            if (result>0){
                System.out.println("record inserted successfully!");
            }
            else{
                System.out.println("failed");
            }

            con.close();
        }

        catch (Exception e){
            e.printStackTrace();        
        }
        sc.close();
    }
}