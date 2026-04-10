//to initialize employee data WAP TO CREATE CONSTRUCTOR

import java.util.Scanner;

public class Employee {
    String EName;
    int EId;
    double Salary;
     
    Employee(int id, String name, double sal) {
        EName = name;
        EId = id;
        Salary = sal;


    }

    void display(){
        System.out.println("The employee of Id no " + EId+ " with name " + EName + " and earns a total of " + Salary + ".");
    }

    public static void main(String[] args){

   
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ID: " );
    int id =sc.nextInt();

    sc.nextLine();//FIX FOR STRING INPUT IDK 
     System.out.println("Enter the name: " );
    String name= sc.nextLine();
    System.out.println("Enter the Salary: " );
    double sal = sc.nextDouble();


    Employee E1=new Employee(id, name, sal);
    E1.display();

    sc.close();
    }
}
