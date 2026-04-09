
import java.util.Scanner;

public class Palindrome{
    public static void main(String[]args){
        String orignal;
        String reverse ="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:"); //get input from user
         orignal=sc.nextLine();

        for(int i=orignal.length()-1; i >=0; i--){
            reverse=reverse + orignal.charAt(i);
        }
        //use .equals() fro content comparision
        if (orignal.equalsIgnoreCase(reverse)){
            System.out.println(orignal +" is a palindrome. ");


        }
        else{
            System.out.println(orignal +" is not a palindrome. ");
        }
       
        sc.close();}
    }