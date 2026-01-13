
import java.util.Scanner;

class BankAccount {

    int accNo;
    String holderName;
    int balance;

    public void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account No : " + accNo);
        System.out.println("Name       : " + holderName);
        System.out.println("Balance    : " + balance);
        System.out.println("-----------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();

        // Initialize 3 accounts
        b1.accNo = 101;
        b1.holderName = "Rahul";
        b1.balance = 5000;
        b2.accNo = 102;
        b2.holderName = "Amit";
        b2.balance = 800;
        b3.accNo = 103;
        b3.holderName = "Neha";
        b3.balance = 12000;

        while (true) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display All Accounts\n4.Low Balance Accounts\n5.Highest Balance Account\n6.Exit");
            int choice = sc.nextInt();

            System.out.print("Enter Account Number: ");
            int acc = sc.nextInt();

            BankAccount current = null;
            if (acc == b1.accNo) {
                current = b1; 
            }else if (acc == b2.accNo) {
                current = b2; 
            }else if (acc == b3.accNo) {
                current = b3; 
            }else {
                System.out.println("Account not found!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    current.deposit(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    current.withdraw(sc.nextInt());
                    break;

                case 3:
                    b1.display();
                    b2.display();
                    b3.display();
                    break;

                case 4:
                    if (b1.balance < 1000) {
                        b1.display();
                    }
                    if (b2.balance < 1000) {
                        b2.display();
                    }
                    if (b3.balance < 1000) {
                        b3.display();
                    }
                    break;

                case 5:
                    BankAccount max = b1;
                    if (b2.balance > max.balance) {
                        max = b2;
                    }
                    if (b3.balance > max.balance) {
                        max = b3;
                    }
                    max.display();
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
