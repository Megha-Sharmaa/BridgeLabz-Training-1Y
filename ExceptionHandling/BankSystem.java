package com.gla.Exception.level1;
// Custom Exception (Checked)
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000); // initial balance

        try {
            double amount = 500; // change to test cases
            acc.withdraw(amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}

