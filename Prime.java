//Prime number check
//break statement , nested logic
//teaches efficiency and optimizing loop exits.
//step 1: check if a no is prime
// step 2: optimizenthe prime check by breaking out if the loop early when a divisor is found
// handle edge cases boundary comdition 
// test with various inputs
//ensure correctness
/*{import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

    

    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return false;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
    }
}*/

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which you wanna check: ");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("Yes "+num +" is Prime");
        } else {
            System.out.println("NO " +num+" is Not Prime");
        }

        sc.close();
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }

        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }

        return true;
    }
}
