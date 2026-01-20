
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

class EquilateralTriangle extends Triangle {

    public void Equi() {
        System.out.println("Equilateral Triangle");
    }
}

class Multilevel_Inheritance {

    public static void main(String[] args) {
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area();
        t1.area(5, 10);
        t1.Equi();
    }
}
