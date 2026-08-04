package OOPS;

import java.util.Scanner;

public class CurrentAccount extends BankAccount {
    double overdraft;

    CurrentAccount(int AccountNumber, String AccountHolderName, double balance, double overdraft) {
        super(AccountNumber, AccountHolderName, balance);
        this.overdraft = overdraft;
    }

    public void useoverdraft(double amount) {
        if (amount <= overdraft) {
            balance -= amount;
            System.out.println("overdraft aount:" + balance);
        }
    }

    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(119, "rajesh", 1000.0, 100.0);
        ca.displayprofile();
        ca.useoverdraft(90.0);
        ca.displayprofile();
    }
}
