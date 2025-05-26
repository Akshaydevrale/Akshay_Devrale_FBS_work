package polymorphism;

class earphone{
	String brand;
	int price;
	
	earphone(){
		this.brand="not given";
		this.price=200;
	}
	earphone(String brand, int price) {
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

class wiredearphone extends earphone{
	int length;
	String type;
	
	wiredearphone(){
		this.length=20;
		this.type="Not given";
	}
	wiredearphone(String brand,int price,int length, String type) {
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

class wirelessearphone extends earphone{
	int batteryMah;
	String chargertype;
	
	wirelessearphone(){
		this.batteryMah=5000;
		this.chargertype="Notgiven";
	}
	wirelessearphone(String brand,int price,int batteryMah, String chargertype) {
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
		earphone e1;
		e1=new wiredearphone("Apple",12000,25,"Copper");
		e1.display();
		
		e1=new wirelessearphone("Realme",40000,1400,"C");
		e1.display();
		
	}

}
