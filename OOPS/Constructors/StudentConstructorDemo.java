// // Write a Java program to demonstrate the use of a default constructor.
// Create a StudentInfo class with instance variables such as roll number, name, and course.
// Initialize these variables using a default constructor and display the student details by creating an object of the class.

class StudentInfo {

    int roll;
    String name;
    String course;

    StudentInfo() {
        roll = 22;
        name = "Anshu";
        course = "BCA";
    }

    void display() {
        System.out.println("Roll no = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
    }
}

class StudentConstructorDemo {

    public static void main(String args[]) {
        StudentInfo s1 = new StudentInfo();
        s1.display();
    }
}
