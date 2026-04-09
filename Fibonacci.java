//import java.util.*; either use this line or the one used in program.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();

        int fib = 0;
        int b=1;
        int c=0;


        for(int i=0; i<=a; i++){
            
            System.out.print(fib+" ");
            c=fib+b;
            fib=b;
            b=c;


        }sc.close();
    }
}