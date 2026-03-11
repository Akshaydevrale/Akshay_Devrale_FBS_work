package polymorphism;

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

class Wiredearphone extends Earphone{
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
		super.display();
		System.out.println("Wire length in cm: "+length);
		System.out.println("Wire type: "+type);
	}
}//class wiredearphone ends here

class Wirelessearphone extends Warphone{
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
		System.out.println(" ");
		super.display();
		System.out.println("Battery size mAh: "+batteryMah);
		System.out.println("Charger type: "+chargertype);
	}
}//class wirelessearphone ends here


public class Test7 {

	public static void main(String[] args) {
		Earphone e1;
		e1=new Wiredearphone("Apple",12000,25,"Copper");
		e1.display();
		
		e1=new Wirelessearphone("Realme",40000,1400,"C");
		e1.display();
		
	}

}

