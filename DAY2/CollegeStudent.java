//inheritance 
class StudentParent {

    int rollNo;
    String name;

    void showDetails() {
        System.out.println("Student roll no.: " + rollNo);
        System.out.println("Student name: " + name);

    }
}

public class CollegeStudent extends StudentParent {

    String colName = "College College";

    void showColDetails() {
        System.out.println("College: " + colName);
    }

    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.rollNo = 1001;
        cs.name = " XYZ";

        cs.showDetails();
        cs.showColDetails();
    }
}