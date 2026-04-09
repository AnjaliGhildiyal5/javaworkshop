
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers:"); //get input from user
        int a=sc.nextInt();
        
        if(a%2==0){                                //check condition 
            System.out.println(a+" is even");}
        else{
            System.out.println(a+" is odd");       //result
        }
        sc.close();
    }

}