package inheritance;

import java.util.Objects;

// Every class inherits from Object class
// Object class (11 methods)
// - equals() method : defines what's equal for the object
// - toString() method : returns the string representation of object
public class BankAccount {
    private String accountNumber;
    private double balance;
    protected int bankCode;

    // Default constructor: constructor without parameters
    public BankAccount() {
        this.accountNumber = "TEST-ACCOUNT";
        this.balance = 0;
        this.bankCode = 0;
    }

    // "method overloading" : same method name with different number of parameters
    public BankAccount(String accountNumber, double balance, int bankCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    public BankAccount(String accountNumber, int bankCode) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.bankCode = bankCode;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void transfer(BankAccount other, double amount) {
        this.balance -= amount;
        other.balance += amount;
    }

    // overloading vs overriding
    // overriding: super - sub
    @Override
    public String toString() {
        return "BankAccount[accountNumber: " + accountNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        // compare ref
        if (this == o) {
            return true;
        }
        // compare type
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        // compare fields
        BankAccount other = (BankAccount) o;
        return this.accountNumber.equals(other.accountNumber);
    }
}
