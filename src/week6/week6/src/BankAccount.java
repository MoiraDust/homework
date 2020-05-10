/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {

	// instance fields
	private double balance;
	String owner;
	private double rate;
	public static int AccNo=100;
	private double userId;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		balance = 0;
		owner = null;
		rate = 0.02;
		AccNo=AccNo+1;//initial is 100,create new account number to plus 1 
		userId=AccNo;
	}

	/**
	 * Constructs a bank account for the user with a given balance.
	 */
	public BankAccount(String name, double initialBalance, double inteRate) {
		balance = initialBalance;
		owner = name;
		rate = inteRate;
		if(rate<0)
			inteRate=0.02;
		AccNo = AccNo+1;
		userId = AccNo;
	}
	/**
	 * Deposits money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	public double deposit(double amount) {
		if (amount > 0)
			balance = balance + amount;
		return balance;
	}

	/**
	 * Withdraws money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	public double withdraw(double amount) {
		if (balance >= amount)
			balance = balance - amount;
		return balance;
	}
	

	/**
	 * Gets the current balance of the bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public double cacuInterest(){
		balance=balance*rate+balance;
		return balance;
	}

}
