package staticdemo;

class Bankaccount{
	double accountno;
	String accountholdername;
	double balance;
	static double interest;
	
	static {
		interest=5.5;
	}
	Bankaccount(){
		this.accountno=100;
		this.accountholdername="not given";
		this.balance=00;
	}
	Bankaccount(double accountno, String accountholdername, double balance) {
		this.accountno = accountno;
		this.accountholdername = accountholdername;
		this.balance = balance;
	}
	double getAccountno() {
		return accountno;
	}
	void setAccountno(double accountno) {
		this.accountno = accountno;
	}
	String getAccountholdername() {
		return accountholdername;
	}
	void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}

	double getInterest() {
		return interest;
	}

	static void setInterest(double interest) {
		Bankaccount.interest = interest;
	}
	void display() {
		System.out.println("Account no:"+accountno);
		System.out.println("Accountholdername:"+accountholdername);
		System.out.println("Balance:"+balance);
		System.out.println("Interest:"+interest);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Bankaccount.setInterest(9.6);

		System.out.println();
		Bankaccount b1=new Bankaccount(12323,"Spider",4500000);
		b1.display();
		
		System.out.println();
		Bankaccount b2=new Bankaccount(342343,"Marco",930000);
		b2.display();
		
		System.out.println();
		Bankaccount b3=new Bankaccount(665753,"Tony",6300000);
		b3.display();
		
	}

}

