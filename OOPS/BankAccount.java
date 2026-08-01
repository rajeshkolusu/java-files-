package OOPS;

import java.util.Scanner;

public class BankAccount {
    int AccountNumber;
    String AccountHolderName;
    Double balance = 0.0;

    public BankAccount(int AccountNumber, String AccountHolderName, double balance) {
        this.AccountNumber = AccountNumber;
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("deposit of " + amount + " is successfull");

    }

    public void withdrawl(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("withdrawl of " + amount + " is successfull");
        } else
            System.err.println("invalid balance");
    }

    public void displayprofile() {
        System.out.println("\n");
        System.out.println("******** Profile Section ********");
        System.out.println("AccountHolderName:" + AccountHolderName);
        System.out.println("AccountNumber:" + AccountNumber);
        System.out.println("Available balance:" + balance);
    }

    public static void main(String[] args) {
        Scanner response = new Scanner(System.in);
        System.out.println("******** Welcome to KNR Banking Sytem ********");
        System.out.print("enter your account number:");
        int accn = response.nextInt();
        response.nextLine();
        System.out.print("enter your name:");
        String name = response.nextLine();

        BankAccount myAccount = new BankAccount(accn, name, 0.0);
        myAccount.displayprofile();
        System.out.println("which service you want deposit or withdrwal: \n 1. deposit \n 2.withdrawl");
        int service = response.nextInt();
        System.out.println("enter the amount :");
        double amount = response.nextDouble();
        switch (service) {
            case 1:
                myAccount.deposit(amount);
                myAccount.displayprofile();
                break;
            case 2:
                myAccount.withdrawl(amount);
                myAccount.displayprofile();
                break;
            default:
                System.err.println("invalid response!");

        }
        response.close();
    }
}
