package week7_01;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    public void addBankAccount(BankAccount bc) {
        accounts.add(bc);
    }

    public void addBankAccount(int anAccountNumber, double initialBalance, String name) {
        BankAccount temp = new BankAccount(anAccountNumber, initialBalance, name);
        this.addBankAccount(temp);
    }

    public int removeBankAccount(int accountNumber) {
        for (BankAccount bc : accounts)
            if (bc.getAccountNumber() == accountNumber) {
                accounts.remove(bc);
                return 1;
            }
        return 0;
    }

    public int retBankAccount(String ownerName) {
        for (BankAccount bc : accounts)
            if (bc.getOwnerName() == ownerName) {
                return bc.getAccountNumber();
            }
        return 0;
    }

}
