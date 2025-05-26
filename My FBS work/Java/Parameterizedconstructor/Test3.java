package Parameterizedconstructor;

class Admin{
	int id;
	String name;
	int salary;
	int allowance;
	
	Admin(int id,String name,int salary,int allowance)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.allowance=allowance;
	}
	Admin(){
		this.id=45;
		this.name="Akshay";
		this.salary=633000;
		this.allowance=1000;
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
	int getAllowance() {
		return allowance;
	}
	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Salary: "+getSalary());
		System.out.println("Allowance: "+getAllowance());
	}
}

public class Test3 {

	public static void main(String[] args) {
		Admin a1;
		a1=new Admin();
		a1.display();
	}
}
