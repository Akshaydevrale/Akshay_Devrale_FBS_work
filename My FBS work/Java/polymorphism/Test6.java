package polymorphism;

class Bag{
	String brand;
	double price;
	
	Bag(){
		this.brand="Not given";
		this.price=20;
	}
	Bag(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	double getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price=price;
	}
	void display() {
		System.out.println("Bag brand: "+brand);
		System.out.println("Bag price: "+price);
	}
}//super class Bag ends here

class Schoolbag extends Bag{
	int noofbooks;
	String stationary;
	
	Schoolbag(){
		this.noofbooks=1;
		this.stationary="not given";
	}
	Schoolbag(String brand,double price,int noofbooks,String stationary){
		super(brand,price);
		this.noofbooks=noofbooks;
		this.stationary=stationary;
	}
	int getNoofbooks() {
		return noofbooks;
	}
	void setNoofbooks(int noofbooks) {
		this.noofbooks=noofbooks;
	}
	String getStationary() {
		return stationary;
	}
	void setStationary(String stationary) {
		this.stationary=stationary;
	}
	void display() {
		super.display();
		System.out.println("No of Books: "+noofbooks);
		System.out.println("Stationary: "+stationary);
	}
}//class schoolbag ends here

class travelbag extends Bag{
	int clothes;
	String gadgets;
	
	travelbag(){
		this.clothes=2;
		this.gadgets="Not given";
	}
	travelbag(String brand,double price,int clothes,String gadgets){
		super(brand,price);
		this.clothes=clothes;
		this.gadgets=gadgets;
	}
	int getClothes() {
		return clothes;
	}
	void setClothes(int clothes) {
		this.clothes=clothes;
	}
	String getGadgets() {
		return gadgets;
	}
	void setGadgets(String gadgets) {
		this.gadgets=gadgets;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("No of Clothes: "+clothes);
		System.out.println("Gadgets in bag: "+gadgets);
	}
}//class travelbag ends here

public class Test6 {

	public static void main(String[] args) {
		Bag b1;
		b1=new Schoolbag("skybag",6000,12,"Pen,pencil and etc");
		b1.display();
		
		b1=new travelbag("American tourister",12000,30,"Camera,charger,etc");
		b1.display();

	}

}
