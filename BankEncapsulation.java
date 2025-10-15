// File: BankEncapsulation.java
class BankAccount {
    // Private data members — hidden from outside access
    private String accountHolder;
    private double balance;

    // Setter for account holder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Deposit method (with validation)
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Deposit amount must be positive.");
    }

    // Withdraw method (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdrawal amount or insufficient funds.");
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

public class BankEncapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Varshini");

        account.deposit(5000);
        account.withdraw(1200);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
