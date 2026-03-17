package exceptionHandling;

class BankAccount {
	int balance;
	
	BankAccount(int b){
		this.balance=b;
	}
	
	public String toString() {
		return "Avialable Balance After Withdraw: "+balance;
	}
}  //class BankAccount ends here

class BalanceException extends Exception {
	
	public String toString() {
		return "Insufficient Balance";
	}
}  //class BalanceException ends here

public class ThrwBankExcptn {

	public static void main(String[] args) {
		try {
			int balance=Integer.parseInt(args[0]);
			int withdraw=Integer.parseInt(args[1]);
			
			if(balance<withdraw) {
				throw new BalanceException();
			}else {
				balance=balance-withdraw;
				BankAccount b1=new BankAccount(balance);
				System.out.println(b1);
			}
		}catch(BalanceException be) {
			System.out.println(be);
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Provide atleast 2 arguments.");
		}catch(NumberFormatException nfe) {
			System.out.println("Provide numbers only.");
		}catch(Exception e) {
			System.out.println("Something went wrong.");
		}

	}

}
