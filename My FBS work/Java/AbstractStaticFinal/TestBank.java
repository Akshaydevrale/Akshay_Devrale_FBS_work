package abstractstaticfinal;

abstract class Bank {
	String name;
	final double accountNo;
	double balance;
	
	Bank(){
		this.accountNo = 0;
		this.name="Not given";
		this.balance=100;
	}
	Bank(String name, double accountNo,double balance) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance=balance;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	double getAccountNo() {
		return accountNo;
	}
	
	abstract double calculateInterest();
	
	public String toString() {
		return "Name:"+name+" Account Number:"+accountNo+" Balance:"+balance;
	}
}  //class Bank ends here

class SavingAccount extends Bank {
	static double interestRate;
	
	static {
		interestRate=0.05;
	}
	SavingAccount(String name, double accountNo,double balance) {
		super(name, accountNo,balance);
	}
	static double getInterestRate() {
		return interestRate;
	}
	static void setInterestRate(double interestRate) {
		SavingAccount.interestRate = interestRate;
	}
	double calculateInterest() {
		return balance*interestRate;
	}
	
	public String toString() {
		return super.toString()+" Interest Rate:"+interestRate;
	}
} //class Savingaccount ends here

class LoanAccount extends Bank {
	static double interestRate;

	static {
		interestRate=0.06;
	}
	LoanAccount(String name, double accountNo, double balance) {
		super(name, accountNo, balance);
	}
	static double getInterestRate() {
		return interestRate;
	}
	static void setInterestRate(double interestRate) {
		LoanAccount.interestRate = interestRate;
	}
	@Override
	double calculateInterest() {
		return balance*interestRate;
	}

	public String toString() {
		return super.toString()+" Interest Rate:"+interestRate;
	}
}  //class Loanaccount ends here

public class TestBank {
	public static void main(String[] args) {
		SavingAccount s1;
		s1=new SavingAccount("Akki",1234, 45000);
		System.out.println(s1.toString());
		System.out.println(s1.calculateInterest());
		
		LoanAccount l1;
		l1=new LoanAccount("Tony", 1111, 77000);
		LoanAccount.setInterestRate(0.04);
		System.out.println(l1.toString());
		System.out.println(l1.calculateInterest());
	}
}
