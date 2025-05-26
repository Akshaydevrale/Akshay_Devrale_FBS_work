package constructor;

class Hr{
	int id;
	String name;
	int salary;
	int commission;
	
	Hr(){
		this.id=22;
		this.name="Akshay";
		this.salary=56000;
		this.commission=1000;
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

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	int getCommission() {
		return commission;
	}

	void setCommission(int commission) {
		this.commission = commission;
	}
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Salary: "+getSalary());
		System.out.println("Commission: "+getCommission());
	}
}

public class Test4 {

	public static void main(String[] args) {
		Hr h1;
		h1=new Hr();
		h1.display();
	}

}
