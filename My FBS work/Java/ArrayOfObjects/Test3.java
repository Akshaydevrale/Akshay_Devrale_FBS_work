package Array;

class Bag{
	String brand;
	int price;
	
	Bag(){
		this.brand="Not given";
		this.price=1000;
	}
	Bag(String brand, int price) {
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
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
	}
}//super class Bag ends here

class schoolbag extends Bag{
	int books;
	String stationary;
	
	schoolbag(){
		super();
		this.books=10;
		this.stationary="Pen";
	}
	schoolbag(String brand,int price,int books, String stationary) {
		super(brand,price);
		this.books = books;
		this.stationary = stationary;
	}
	int getBooks() {
		return books;
	}
	void setBooks(int books) {
		this.books = books;
	}
	String getStationary() {
		return stationary;
	}
	void setStationary(String stationary) {
		this.stationary = stationary;
	}
	void display() {
		System.out.println("Schoolbag Details:");
		super.display();
		System.out.println("No of Books: "+books);
		System.out.println("Stationary"+stationary);
	}
}//class schoolbag ends here

class travellingbag extends Bag {
	int clothes;
	String gadgets;
	
	travellingbag(){
		super();
		this.clothes=00;
		this.gadgets="3";
	}
	travellingbag(String brand,int price,int clothes, String gadgets) {
		super(brand,price);
		this.clothes = clothes;
		this.gadgets = gadgets;
	}
	int getClothes() {
		return clothes;
	}
	void setClothes(int clothes) {
		this.clothes = clothes;
	}
	String getGadgets() {
		return gadgets;
	}
	void setGadgets(String gadgets) {
		this.gadgets = gadgets;
	}
	void display() {
		System.out.println("Travellingbag Details:");
		super.display();
		System.out.println("No of clothes: "+clothes);
		System.out.println("Electronics gadgets: "+gadgets);
	}
}//class travellingbag ends here

public class Test3 {

	public static void main(String[] args) {
		Bag[] arrb1;
		arrb1=new Bag[2];
		
		arrb1[0]=new schoolbag("Skybags",1200,12,"Pen,pencil,etc");
		arrb1[1]=new travellingbag("American tourister",25000,40,"Camera charger,etc");
		
		for(int i=0;i<arrb1.length;i++) {
			arrb1[i].display();
		}
		
		

	}

}
