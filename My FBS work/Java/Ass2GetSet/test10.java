package Ass2GetSet;

class product{
	int id;
	String name;
	int quantity;
	int price;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id=id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price=price;
	}
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Quantity: "+getQuantity());
		System.out.println("Price: "+getPrice());
	}
}

public class test10 {

	public static void main(String[] args) {
		product p1;
		p1=new product();
		
		p1.setId(10);
		p1.setName("Tony Stark");
		p1.setQuantity(100);
		p1.setPrice(9999);
		
		p1.display();
	}

}
