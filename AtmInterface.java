import java.util.*;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
            return false;
        }
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        userAccount = account;
    }

    public void checkBalance() {
        double balance = userAccount.getBalance();
        System.out.println("Account Balance: Rs" + balance);
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return userAccount.withdraw(amount);
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);

        while (true) {
            System.out.println("ATM Menu-");
            System.out.println("1 Check Balance");
            System.out.println("2 Deposit");  
            System.out.println("3 Withdraw");
            System.out.println("4 Exit");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs");
                    double withdrawalAmount = sc.nextDouble();
                    if (atm.withdraw(withdrawalAmount)) {
                        System.out.println("Please take your cash.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
