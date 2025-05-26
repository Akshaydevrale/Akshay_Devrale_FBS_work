package Ass2GetSet;

class admin{
	int id;
	String name;
	int salary;
	int allowance;

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

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	void display() {
		System.out.println("id:"+getId());
		System.out.println("Name:"+getName());
		System.out.println("Salary:"+getSalary());
		System.out.println("Allowance:"+getAllowance());
	}
	
}

public class test3 {

	public static void main(String[] args) {
		admin a1;
		a1=new admin();
		
		a1.setId(45);
		a1.setName("Rohit Sharma");
		a1.setSalary(163500000);
		a1.setAllowance(250000);
		
		a1.display();

	}

}
