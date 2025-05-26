package Array;

class Payment{
	int amountofpay;
	String paymentstatus;
	
	Payment(){
		this.amountofpay=45000;
		this.paymentstatus="Not given";
	}
	Payment(int amountofpay, String paymentstatus) {
		this.amountofpay = amountofpay;
		this.paymentstatus = paymentstatus;
	}
	int getAmountofpay() {
		return amountofpay;
	}
	void setAmountofpay(int amountofpay) {
		this.amountofpay = amountofpay;
	}
	String getPaymentstatus() {
		return paymentstatus;
	}
	void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	void display() {
		System.out.println("Amount of payment: "+amountofpay);
		System.out.println("Payment status: "+paymentstatus);
	}
}//super class payment ends here

class Creditcardpayment extends Payment{
	double cardnumber;
	String cardholdername;
	
	Creditcardpayment(){
		this.cardnumber=222222;
		this.cardholdername="Not given";
	}
	Creditcardpayment(int amountofpay,String paymentstatus,double cardnumber, String cardholdername) {
		super(amountofpay,paymentstatus);
		this.cardnumber = cardnumber;
		this.cardholdername = cardholdername;
	}
	double getCardnumber() {
		return cardnumber;
	}
	void setCardnumber(double cardnumber) {
		this.cardnumber = cardnumber;
	}
	String getCardholdername() {
		return cardholdername;
	}
	void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
	void display() {
		super.display();
		System.out.println("Credit card number: "+cardnumber);
		System.out.println("Credit card holder name: "+cardholdername);
	}
	
}//class Creditcardpayment ends here

class Upipayment extends Payment{
	double upiid;
	String provider;
	
	Upipayment(){
		this.upiid=33;
		this.provider="Not given";
	}
	Upipayment(int amount,String paymentstatus,double upiid, String provider) {
		super(amount,paymentstatus);
		this.upiid = upiid;
		this.provider = provider;
	}
	double getUpiid() {
		return upiid;
	}
	void setUpiid(double upiid) {
		this.upiid = upiid;
	}
	String getProvider() {
		return provider;
	}
	void setProvider(String provider) {
		this.provider = provider;
	}
	void display() {
		super.display();
		System.out.println("Upi id: "+upiid);
		System.out.println("Upi provider: "+provider);
	}
}//class upiid ends here


public class Test2 {

	public static void main(String[] args) {
		Payment[] arrPay;
		arrPay=new Payment[2];
		
		arrPay[0]=new Creditcardpayment(11000,"Pending",347838,"Brock");
		arrPay[1]=new Upipayment(22000,"Rejected",678333,"Google Pay");
		
		for(int i=0;i<arrPay.length;i++) {
			arrPay[i].display();
		}
	}

}
