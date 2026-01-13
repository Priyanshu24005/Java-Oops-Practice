
import java.util.Scanner;

class Mobile {

    String brand;
    String model;
    int price;
    int stock;

    public void display() {
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
        System.out.println("Stock = " + stock);
    }
}

class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.brand = "Samsung";
        m1.model = "s24";
        m1.price = 40000;
        m1.stock = 0;

        m2.brand = "Apple";
        m2.model = "iPhone 17 pro";
        m2.price = 150000;
        m2.stock = 5;

        m3.brand = "Vivo";
        m3.model = "X300";
        m3.price = 76000;
        m3.stock = 8;

        while (true) {
            System.out.println("1.Display All Mobiles\n2.Display Mobiles Under 50000\n3.Display Out of Stock Mobiles\n4.Display Costliest Mobile\n5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    m1.display();
                    System.out.println();
                    m2.display();
                    System.out.println();
                    m3.display();
                    System.out.println();
                    break;
                case 2:
                    if (m1.price < 50000) {
                        m1.display();
                    }
                    if (m2.price < 50000) {
                        m2.display();
                    }
                    if (m3.price < 50000) {
                        m3.display();
                    }
                    break;
                case 3:
                    if (m1.stock == 0) {
                        m1.display();
                    }
                    if (m2.stock == 0) {
                        m2.display();
                    }
                    if (m3.stock == 0) {
                        m3.display();
                    }
                    break;
                case 4:
                    if (m1.price > m2.price && m1.price > m3.price) {
                        System.out.println(m1.brand + m1.model + "is the costliest mobile");
                    } else if (m2.price > m1.price && m2.price > m3.price) {
                        System.out.println(m2.brand + m2.model + "is the costliest mobile");
                    } else if (m3.price > m2.price && m3.price > m1.price) {
                        System.out.println(m3.brand + m3.model + "is the costliest mobile");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
