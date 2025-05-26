package constructor;

class Product{
	int id;
	String name;
	int quantity;
	int price;
	
	Product(){
		this.id=448393;
		this.name="Santoor";
		this.quantity=100;
		this.price=35;
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

	void setQuantity(int quantity) {
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
