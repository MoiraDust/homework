
public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount A = new BankAccount("userA",100,0.02);
		BankAccount B = new BankAccount("userB",200,0.03);
		double withDrawA = A.withdraw(10);
		System.out.println("withdraw A:"+withDrawA);
		double withDrawB = B.withdraw(15);
		System.out.println("withdraw B:"+withDrawA);
		double depositA = A.deposit(10);
		System.out.println("deposit A:"+depositA);
		double depositB = B.deposit(15);
		System.out.println("deposit B:"+depositB);
		double interestA = A.cacuInterest();
		System.out.println("interest A:"+interestA);
		double interestB = B.cacuInterest();
		System.out.println("interest B:"+interestB);
		
	}

}
