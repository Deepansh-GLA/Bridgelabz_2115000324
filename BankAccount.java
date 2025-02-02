import java.util.*;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1001, "Alice Johnson", 5000.0);
        System.out.println("Initial Balance: $" + ba1.getBalance());
        ba1.setBalance(6000.0);
        System.out.println("Updated Balance: $" + ba1.getBalance());
    }
}
