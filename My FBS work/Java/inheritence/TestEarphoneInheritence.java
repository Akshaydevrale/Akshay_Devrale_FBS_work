package inheritence;

class Earphone{
	String brand;
	int price;
	
	Earphone(){
		this.brand="not given";
		this.price=200;
	}
	Earphone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void display() {
		System.out.println("Earphone brand: "+brand);
		System.out.println("Earphone price: "+price);
	}
}//super class earphone ends here

class WiredEarphone extends Earphone{
	int length;
	String type;
	
	Wiredearphone(){
		this.length=20;
		this.type="Not given";
	}
	Wiredearphone(String brand,int price,int length, String type) {
		super(brand,price);
		this.length = length;
		this.type = type;
	}
	int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	void display() {
		System.out.println("Wired earphones details: ");
		super.display();
		System.out.println("Wire length: "+length);
		System.out.println("Wire type: "+type);
	}
}//class wiredearphone ends here

class Wirelessearphone extends Earphone{
	int batteryMah;
	String chargertype;
	
	Wirelessearphone(){
		this.batteryMah=5000;
		this.chargertype="Notgiven";
	}
	Wirelessearphone(String brand,int price,int batteryMah, String chargertype) {
		super(brand,price);
		this.batteryMah = batteryMah;
		this.chargertype = chargertype;
	}
	int getBatteryMah() {
		return batteryMah;
	}
	void setBatteryMah(int batteryMah) {
		this.batteryMah = batteryMah;
	}
	String getChargertype() {
		return chargertype;
	}
	void setChargertype(String chargertype) {
		this.chargertype = chargertype;
	}
	void display() {
		System.out.println("Wireless earphones details: ");
		super.display();
		System.out.println("Battery size mAh: "+batteryMah);
		System.out.println("Charger type: "+chargertype);
	}
}//class wirelessearphone ends here


public class TestEarphoneInheritence {

	public static void main(String[] args) {
		
		Wiredearphone e1=new Wiredearphone(); 

		e1.setBrand("OnePlus");
		e1.setPrice(1200);
		e1.setLength(30);
		e1.setType("Copper");
		e1.display();
		
		Wirelessearphone e2=new Wirelessearphone();
		e2.setBrand("Realme");
		e2.setPrice(2000);
		e2.setBatteryMah(4000);
		e2.setChargertype("C");
		e2.display();
	}

}

