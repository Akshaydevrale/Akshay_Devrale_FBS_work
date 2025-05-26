package Parameterizedconstructor;

class Employee{
	int id;
	String name;
	int salary;
	
	Employee(int id, String name, int salary)//Parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	Employee()//Default constructor
	{
		this.id=50;
		this.name="Akshay";
		this.salary=77000;
	
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
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Salary: "+getSalary());
	}
}
public class Test2 {

	public static void main(String[] args) {
		Employee e1;
		e1=new Employee();
		e1.display();
	}

}

