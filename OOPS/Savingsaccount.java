package OOPS;

public class Savingsaccount extends BankAccount {
    double interestrate;

    public Savingsaccount(int AccountNumber, String AccountHolderName, Double balance, double interestrate) {
        super(AccountNumber, AccountHolderName, balance);
        this.interestrate = interestrate;
    }

    public void applyinterest() {
        balance += balance * interestrate;
        System.out.println("the interest rate  for available balance is :" + balance);
    }

    public static void main(String[] args) {
        Savingsaccount sa = new Savingsaccount(11, "raju", 80.0, 0.05);
        sa.displayprofile();
        sa.applyinterest();
        sa.deposit(1000.0);
        sa.applyinterest();
        sa.displayprofile();
        sa.withdrawl(100);
        sa.displayprofile();
    }

}
