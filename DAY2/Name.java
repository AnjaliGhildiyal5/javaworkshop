import java.util.Scanner;

public class Name {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        // create scanner object to input from user
        Scanner SC = new Scanner(System.in);
        String name1 =SC.nextLine();
        // display various content you wanna show
        System.out.println("The name you entered is: "+ name1);
        System.out.println("The length of the name is "+name1.length() );
        System.out.println("The uppercase of the name is "+name1.toUpperCase() );
        //'uppercase' is used to check whether it is uppercase or not ; but this converts here
        System.out.println("The length of the name is "+name1.toLowerCase() );
        SC.close();// close to free the system resources 
    }
    
}
