//program for simple class and object creation
class Subject {
    String name;
    int marks;

    //  Created method to display subject and marks
    void display() {
        System.out.println("Subject Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class subjects {
    public static void main(String[] args) {
        // Createing an object of Subject class
        Subject sub1 = new Subject();

        // Assign values
        sub1.name = "Mathematics";
        sub1.marks = 95;

        // call that method
        sub1.display();
    }
}
