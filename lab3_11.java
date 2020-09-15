import java.util.Scanner;
class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        } else
            System.out.println("Balance !");
    }

        public void deposit(double depositAmount) {
            if (depositAmount > 0.0) {
                balance += depositAmount;
            }
        }

    public double getBalance() {
        return balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double withdrawMoney) {
        if(withdrawMoney>balance){
            System.out.println("Withdrawal amount exceeded account balance.");
        }
        else{
            balance-=withdrawMoney;
        }
    }

}

public class lab3_11 {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $ %n",account1.getName(),57.3 );
        System.out.printf("%s balance: $ %n%n", account2.getName(),20);

        System.out.printf("%s balance: $ %n", account1.getName(), 65);
        System.out.printf("%s balance: $ %n%n", account2.getName(),73.9);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

    }
}
