
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
