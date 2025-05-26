package inheritence;

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
		System.out.println("Wired earphones details: ");
		super.display();
		System.out.println("Wire length: "+length);
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
		System.out.println("Wireless earphones details: ");
		super.display();
		System.out.println("Battery size mAh: "+batteryMah);
		System.out.println("Charger type: "+chargertype);
	}
}//class wirelessearphone ends here


public class earphoneinheritence {

	public static void main(String[] args) {
		
		wiredearphone e1=new wiredearphone(); 

		e1.setBrand("OnePlus");
		e1.setPrice(1200);
		e1.setLength(30);
		e1.setType("Copper");
		e1.display();
		
		wirelessearphone e2=new wirelessearphone();
		e2.setBrand("Realme");
		e2.setPrice(2000);
		e2.setBatteryMah(4000);
		e2.setChargertype("C");
		e2.display();
	}

}
