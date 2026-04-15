import java.sql.*;
public class DisplayDemo{

    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3309/studentdb";
        String user ="root";
        String password="pass";

       // Scanner sc = new Scanner(System.in);


        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!!");

            //create statement 
            Statement st=con.createStatement();

             //after create statement for display execute select query
            ResultSet rs =st.executeQuery("SELECT * FROM students");   // only use when we want to look for the existing value inthe database
            // display data
            System.out.print("ID | NAME | SECTION | MARKS");
            System.out.print("\n--------------------------------\n");
            while(rs.next()){
            System.out.println(rs.getInt("ID")+" | "+ rs.getString("Name")+" | "+ rs.getString("sec")+" | "+ rs.getInt("mar")); 
        }

            con.close();
            System.out.println("connecction closed!");
        }
            
        

        catch (Exception e){
            e.printStackTrace();        
        }
    }
}



