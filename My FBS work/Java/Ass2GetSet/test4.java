package Ass2GetSet;

class hr{
	int id;
	String name;
	int salary;
	int commission;
	
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
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary=salary;
	}
	int getCommission() {
		return commission;
	}
	void setCommission(int commission) {
		this.commission=commission;
	}
	void display() {
		System.out.println("Id :"+getId());
		System.out.println("Name :"+getName());
		System.out.println("Salary :"+getSalary());
		System.out.println("Commission :"+getCommission());
	}
	
}

public class test4 {

	public static void main(String[] args) {
		hr h1;
		h1=new hr();
		h1.setId(111);
		h1.setName("Parag");
		h1.setSalary(45000);
		h1.setCommission(1000);
		
		h1.display();
	}

}
