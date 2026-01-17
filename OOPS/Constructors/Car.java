// Write a Java program to create a Car class with instance variables brand, fuelType, and doors.

// Use a parameterized constructor to initialize these variables.
// Create objects of the class and display their details using a method.
class c {

    String brand;
    String fuelType;
    String doors;

    c(String b, String f, String d) {
        this.brand = b;
        this.fuelType = f;
        this.doors = d;
    }

    void display() {
        System.out.println("brand = " + brand);
        System.out.println("fuelType = " + fuelType);
        System.out.println("doors = " + doors);
    }
}

class Car {

    public static void main(String[] args) {
        c c1 = new c("Honda", "Petrol", "black");
        c1.display();
    }

}
