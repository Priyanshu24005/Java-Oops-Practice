
class Shape {

    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {

    public void area(double l, double h) {
        System.out.println((l * h) / 2);
    }
}

class Single_Inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(5, 10);
    }
}
