// program to create method for add subtract mul and divide

import java.util.Scanner;

public class p1 {
        public static int Add(int a,int b) { //create variables that are unique to the methodso the values dont get mixed
           int z=(a+b);
            return z;
        }
    

        public static int sub(int a,int b) {
             int z=(a-b);
            return z;
        }
    

    
        public static int Mul(int a,int b) {
             int z=(a*b);
            return z;
        }

         public static String Div(int a,int b) {// or you can apply this condition while taking input
            if (b==0){
                return("not defined ");
            }
            else{
             String z=String.valueOf(a/b);  //here a/b will return int value but the return type is string it will generate an error so use datatype.valueof()
            return z;
            }
        }
    
    
public static void main(String[] args){
    System.out.println("Enter number 1 ");
    System.out.println("Enter number 2 ");
      
        // create scanner object to input from user
        Scanner SC = new Scanner(System.in);
        int num1 =SC.nextInt();
        int num2 =SC.nextInt();

    System.out.println("the sum of the : "+ num1+ "and "+num2+" is : "+ Add(num1,num2));  
    System.out.println("the division of the : "+ num1+ "and "+num2+" is : "+ Div(num1,num2));  

SC.close();
}
}