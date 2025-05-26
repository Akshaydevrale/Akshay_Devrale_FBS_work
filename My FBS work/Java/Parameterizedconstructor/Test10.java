package Parameterizedconstructor;

class Product{
	int id;
	String name;
	int quantity,price;
	
	Product(){
		this.id=5367373;
		this.name="Milton";
		this.quantity=50;
		this.price=1200;
	}
	Product(int id,String name,int quantity,int price){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getQuantity() {
		return quantity;
	}
	void setQantity(int quantity) {
		this.quantity = quantity;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Quantity: "+getQuantity());
		System.out.println("Price: "+getPrice());
	}
}

public class Test10 {

	public static void main(String[] args) {
		Product p1;
		p1=new Product();
		p1.display();
	}

}
