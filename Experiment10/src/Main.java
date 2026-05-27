public class Main {

    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");

        SavingsAccount s1 = new SavingsAccount(101, "Rahul", 10000);

        s1.deposit(2000);

        s1.displayDetails();

        s1.calculateInterest();

        System.out.println();

        System.out.println("----- Current Account -----");

        CurrentAccount c1 = new CurrentAccount(102, "Anita", 20000);

        c1.deposit(3000);

        c1.displayDetails();

        c1.calculateInterest();
    }
}