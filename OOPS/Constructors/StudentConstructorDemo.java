
class StudentInfo {

    int roll;
    String name;
    String course;

    //default Constructor
    StudentInfo() {
        roll = 22;
        name = "Anshu";
        course = "BCA";
    }

    //parameterized Constructor
    StudentInfo(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    //copy Consturctor
    StudentInfo(StudentInfo s3) {
        this.roll = s3.roll;
        this.name = s3.name;
        this.course = s3.course;
    }

    void display() {
        System.out.println("Roll no = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course + "\n");
    }

}

class StudentConstructorDemo {

    public static void main(String args[]) {
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo(22, "Anshu", "BCA");
        StudentInfo s3 = new StudentInfo(s2);

        System.out.println("Before Modifying\n");
        s1.display();
        s2.display();
        s3.display();

        s2.roll = 30;
        s2.name = "Priyanshu";
        s2.course = "MBA";

        System.out.println("After modifying\n");
        s1.display();
        s2.display();
        s3.display();
    }
}
