
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

class Cricle extends Shape {

    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

class Hierarchel_Inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(5, 10);

        Cricle c1 = new Cricle();
        c1.area();
        c1.area(7);
    }
}
