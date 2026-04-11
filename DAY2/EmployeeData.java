public  class EmployeeData{
 String Empname;   
int empId;

static String company="tech abc";
EmployeeData(String a, int b){
Empname=a;
empId=b;

}

void display(){
    System.out.println ("Details for  the ID no  " + empId + " is :");
    System.out.println ("------------------------------------------");
    System.out.println ("the employee name is " + Empname+ " and company name is " + company);
    System.out.println ("-----------------------------------------");
    System.out.println ("-------------------------------------------");
}
//display method


public static void main(String[] args){
    EmployeeData E1 = new EmployeeData("xyz",11);
    EmployeeData E2 = new EmployeeData("Abc",12);
    EmployeeData E3 = new EmployeeData("Def",13);
    EmployeeData E4 = new EmployeeData("Ghi",14);
   E1.display();
   E2.display();
   E3.display();
   E4.display();
}}