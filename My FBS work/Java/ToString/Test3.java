package ToString;

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
	@Override
	public String toString() {
		return "Amountofpay:" + amountofpay + "  Paymentstatus:" + paymentstatus;
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
	@Override
	public String toString() {
		System.out.println("Credit Card Payment:");
		return super.toString()+"  Cardnumber:" + cardnumber + "  Cardholdername=" + cardholdername;
	}
	
}//class Creditcardpayment ends here

class Upipayment extends Payment{
	double upiid;
	String provider;
	
	Upipayment(){
		this.upiid=33;
		this.provider="Not given";
	}
	Upipayment(int amountofpay,String paymentstatus,double upiid, String provider) {
		super(amountofpay,paymentstatus);
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
	@Override
	public String toString() {
		System.out.println("Upi Payment:");
		return super.toString()+"  Upiid=" + upiid + "  Provider:" + provider;
	}
	
}//class upiid ends here

public class Test3 {

	public static void main(String[] args) {
		Payment p1;
		p1=new Creditcardpayment(5000,"Pending",372823,"Akki");
		System.out.println(p1);
		
		p1=new Upipayment(10000,"Completed",47828284,"GooglePay");
		System.out.println(p1);
	}

}
