package OOPS;

import java.util.Scanner;

public class BankAccount {
    int AccountNumber;
    String AccountHolderName;
    Double balance;

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

    public void transferFunds(BankAccount target, double amount) {

        if (this.balance >= amount) {
            this.balance -= amount;
            target.balance += amount;
            System.out.println(
                    "transfer of " + amount + " is successfull from " + this.AccountNumber + "to"
                            + target.AccountNumber);
        } else if (this.balance < amount) {
            System.out.println("the balance is insufficient ! ");

        }

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
        int service = 0;
        while (service != 4) {

            System.out.println(
                    "Banking services are: \n 1. deposit \n 2.withdrawl \n 3.TransferFunds \n 4.Logout");
            service = response.nextInt();
            double amount;

            switch (service) {
                case 1:
                    System.out.println("enter the amount :");
                    amount = response.nextDouble();
                    myAccount.deposit(amount);
                    myAccount.displayprofile();
                    break;
                case 2:
                    System.out.println("enter the amount :");
                    amount = response.nextDouble();
                    myAccount.withdrawl(amount);
                    myAccount.displayprofile();
                    break;
                case 3:
                    System.out.print("enter the  account number of reciever:");
                    int TargetAccountNumber = response.nextInt();
                    response.nextLine();
                    System.out.print("enter the reciever name :");
                    String targetname = response.nextLine();
                    BankAccount target = new BankAccount(TargetAccountNumber, targetname, 0.0);

                    System.out.print("enter the amount :");
                    amount = response.nextDouble();
                    myAccount.transferFunds(target, amount);
                    myAccount.displayprofile();
                    target.displayprofile();
                    continue;
                case 4:
                    System.out.println("Logged out successfully!");
                    break;
            }
        }
        response.close();
    }
}
