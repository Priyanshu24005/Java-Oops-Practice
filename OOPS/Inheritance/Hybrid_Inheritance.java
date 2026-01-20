// Base class

class A {

    void showA() {
        System.out.println("Class A");
    }
}

// Multilevel inheritance
class B extends A {

    void showB() {
        System.out.println("Class B");
    }
}

// Hierarchical inheritance
class C extends A {

    void showC() {
        System.out.println("Class C");
    }
}

// Multilevel continues
class D extends B {

    void showD() {
        System.out.println("Class D");
    }
}

public class Hybrid_Inheritance {

    public static void main(String[] args) {
        D obj = new D();

        obj.showA();  // from A
        obj.showB();  // from B
        obj.showD();  // from D
    }
}
