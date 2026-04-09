
import java.util.Scanner;

public class Factorial {
    //Declare a variale with had code values 5 with long type
    // create a for loop 
    //for(int i=1; i<=num;i++){fact*=i;} //fact=fact*i
    //display
    public static void main(String[]args){
        int factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:"); //get input from user
        int num=sc.nextInt();
        
        for(int i=num; i>=1; i--) {
            factorial *= i;
        }                //calculate factorial
        System.out.println("The Factorial is "+factorial);
        sc.close();
}
}