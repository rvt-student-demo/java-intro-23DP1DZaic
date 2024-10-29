package lv.rvt;

public class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }


    public void deposit(double amount) {
        this.balance = this.balance + amount;

    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + "balance: " + this.balance;
    }




    public static void main(String[] args) {

    Account MathewAccount = new Account("Mathew's account", 1000.00);
    Account MyAccount = new Account("My account", 0.00);


    MathewAccount.withdraw(100);
    System.out.println("The balance of Mathew's account is now: " + MathewAccount.balance());
    MyAccount.deposit(100);
    System.out.println("The balance of my account is now: " + MyAccount.balance());
    













































    }
}
