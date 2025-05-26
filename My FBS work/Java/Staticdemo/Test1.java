package Staticdemo;

class BankAccount{
	int accNo;
	String accHolderName;
	double balance;
	static double interestRate;

	static {
		interestRate=4.3;
	}
	public BankAccount() {
		this.accNo = 100;
		this.accHolderName = "not given";
		this.balance = 0;
	}
	BankAccount(int accNo, String accHolderName, double balance) {
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}	
	public double getInterestRate() {
		return interestRate;
	}
	public static void setInterest(double ir) {
		interestRate = ir;	
	}
	void display() {
		System.out.println("Account Number: "+this.accNo);
		System.out.println("Account Holdre Name: "+this.accHolderName);
		System.out.println("Current Balance: "+this.balance);
		System.out.println("Interest Rate: "+this.interestRate);
	}
}


public class Test1 {

		public static void main(String[] args) {

			BankAccount b1 = new BankAccount(1111,"Spider",450000 );
			b1.display();
			System.out.println();
			BankAccount b2 = new BankAccount(2222,"Tony",50000);
			b2.display();
			System.out.println();
			BankAccount b3= new BankAccount(3333,"Marco", 55000);
			b3.display();
			System.out.println();
			
			BankAccount.setInterest(7.5);
			
			b1.display();
			System.out.println();
			b2.display();
			System.out.println();
			b3.display();

	}

}
