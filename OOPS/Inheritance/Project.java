
import java.util.Scanner;

class Account {

    int accNo;
    String holderName;
    int balance;

    void setDetails(int accNo, String holderName, int balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println(accNo);
        System.out.println(holderName);
        System.out.println(balance);
    }

    public void deposit(int amount) {
        System.out.println(amount + "has been deposited to your account");
        balance += amount;

        System.out.println(balance);
    }

    public void withdraw(int amount) {
        System.out.println(amount + "Withdrawn from the account");
        balance -= amount;
        System.out.println(balance);
    }
}

class SavingsAccount extends Account {

    double interestRate = 5;
    int t = 1;

    public void CalculateInterest() {
        double Si = (balance * interestRate * t) / 100;

        System.out.println("Interest  " + Si);
    }

}

class CurrentAccount extends Account {

    int overdraftLimit = 5000;

    public void checkOverdraft(int amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn");
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Limit Reached");
        }
    }
}

class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter AccountNo");
        int accNo = sc.nextInt();
        System.out.println("Enter holderName");
        String holderName = sc.next();
        System.out.println("Enter Balance");
        int balance = sc.nextInt();

        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        sa.setDetails(accNo, holderName, balance);
        ca.setDetails(accNo, holderName, balance);

        while (true) {
            System.out.println("1.displayAccount\n2.Deposit\n3.Withdraw\n4.Calculate Interest\n5.Check Overdraft\n6.Exit");
            int choice = sc.nextInt();
            int amount = 0;
            if (choice == 2 || choice == 3 || choice == 5) {
                System.out.println("Enter Amount");
                amount = sc.nextInt();
            }
            switch (choice) {
                case 1:
                    sa.displayAccount();
                    break;
                case 2:
                    sa.deposit(amount);
                    break;
                case 3:
                    sa.withdraw(amount);
                    break;
                case 4:
                    sa.CalculateInterest();
                    break;
                case 5:
                    ca.checkOverdraft(amount);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }

    }
}
