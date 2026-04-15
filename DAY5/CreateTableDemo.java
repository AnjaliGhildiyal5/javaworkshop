import java.sql.*;
import java.util.Scanner;

public class CreateTableDemo{

    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3309/studentdb";
        String user ="root";
        String password="pass";

        Scanner sc = new Scanner(System.in);


        try{
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!!");

            // create statement 
            Statement st = con.createStatement();

             //SQL querry to create table

            String query ="CREATE TABLE students ("+"Id INT primary key," + "Name Varchar(20)," + "sec VARCHAR(20),"+"mar INT)";

             //Execute query
            st.executeUpdate(query);
            System.out.println("table created");

             con.close();
            System.out.println("connecction closed!");
        }
        catch (Exception e){
            e.printStackTrace();        
        }
        sc.close();
        }
        }
