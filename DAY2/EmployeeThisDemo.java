//use  of instance and local variables
public class EmployeeThisDemo {
    // instance variables 
    int empId=111;
    String empName="abc";

    // constructor with same variables
    EmployeeThisDemo(int empId, String empName ){
        // use 'this' to refer to current object variabkes
        this.empId=empId;
        this.empName=empName; 
    
    }
    void display(){
        System.out.println("the id is "+ empId+" and the name is: "+empName);
    }

    public static void main(String[] args) {
        EmployeeThisDemo e1 = new EmployeeThisDemo(10, "xyz");
        e1.display();
    }
    

    
}
