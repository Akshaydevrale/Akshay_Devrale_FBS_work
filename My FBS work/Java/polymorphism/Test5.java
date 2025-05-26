package polymorphism;

class Payment{
	int amount;
	String paymentstatus;
	
	Payment(){
		this.amount=1;
		this.paymentstatus="Not given";
	}
	Payment(int amount,String paymentstatus){
		this.amount=amount;
		this.paymentstatus=paymentstatus;
	}
	int getAmount() {
		return amount;
	}
	void setAmount(int amount) {
		this.amount=amount;
	}
	String getPaymentstatus() {
		return paymentstatus;
	}
	void setPaymentstatus(String paymentstatus) {
		this.paymentstatus=paymentstatus;
	}
	void display() {
		System.out.println("Amount of payment: "+amount);
		System.out.println("Payment Status: "+paymentstatus);
	}
} // super class Payment ends here

class Upipayment extends Payment{
	int upiid;
	String provider;
	
	Upipayment(){
		this.upiid=10;
		this.provider="Not given";
	}
	Upipayment(int amount,String paymentstatus,int upiid,String provider){
		super(amount,paymentstatus);
		this.upiid=upiid;
		this.provider=provider;
	}
	int getUpiid() {
		return upiid;
	}
	void setUpiid(int upiid) {
		this.upiid = upiid;
	}
	String getProvider() {
		return provider;
	}
	void setProvider(String provider) {
		this.provider = provider;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Upiid: "+upiid);
		System.out.println("Upi Provider: "+provider);
	}
}//class Upiid ends here

class Creditcardpayment extends Payment{
	int cardnumber;
	String cardholder;
	
	Creditcardpayment(){
		this.cardnumber=2328289;
		this.cardholder="Not given";
	}
	
	Creditcardpayment(int amount,String paymentstatus,int cardnumber,String cardholder){
		super(amount, paymentstatus);
		this.cardnumber=cardnumber;
		this.cardholder=cardholder;
	}
	int getCardnumber() {
		return cardnumber;
	}
	void setCardnumber(int cardnumber) {
		this.cardnumber=cardnumber;
	}
	String getCardholder() {
		return cardholder;
	}
	void setCardholder(String cardholder) {
		this.cardholder=cardholder;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Card number: "+cardnumber);
		System.out.println("Card holder: "+cardholder);
	}
}//class creditcardpayment ends here
public class Test5 {

	public static void main(String[] args) {
		Payment p1;
		p1=new Upipayment(2345,"Pending",373737,"Googlepay");
		p1.display();
		
		p1=new Creditcardpayment(3535,"Completed",4627,"Rahul");
		p1.display();
	}

}
