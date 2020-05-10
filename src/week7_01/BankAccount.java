package week7_01;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;
    public static double Accno = 100;

    /**
     * Constructs a bank account with a zero balance
     *
     * @param anAccountNumber the account number for this account
     */
    public BankAccount(int anAccountNumber, String name) {
        accountNumber = anAccountNumber;
        balance = 0;
        ownerName = name;
    }

    /**
     * Constructs a bank account with a given balance
     *
     * @param anAccountNumber the account number for this account
     * @param initialBalance  the initial balance
     */
    public BankAccount(int anAccountNumber, double initialBalance, String name) {
        accountNumber = anAccountNumber;
        balance = initialBalance;
        ownerName = name;
    }


    /**
     * Gets the account number of this bank account. @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }


    /**
     * Deposits money into the bank account. @param amount the amount to deposit
     */
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    /**
     * Withdraws money from the bank account. @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    /**
     * Gets the current balance of the bank account. @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}

