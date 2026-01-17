// Write a Java program to create an Employee class with:

// Instance variables: empId, name, salary
// Constructors:
// Default constructor – initializes employee details to default values
// Parameterized constructor – initializes employee details using given values
// Constructor chaining: Use this() in the default constructor to call the parameterized constructor
// Display method: Prints employee details
// Test: Create objects using both constructors and display details.
class Emp {

    int empId;
    String name;
    int salary;

    Emp() {
        this(0, "Unknown", 0);
    }

    Emp(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID = " + empId);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary + "\n");
    }
}

class Employee {

    public static void main(String[] args) {

        Emp e1 = new Emp();
        e1.display();

        Emp e2 = new Emp(101, "Anshu", 500000);
        e2.display();
    }
}
