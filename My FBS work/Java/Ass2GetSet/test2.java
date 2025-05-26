package Ass2GetSet;

class employee{
	int id;
	String name;
	int salary;
	
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
	void display() {
		System.out.println("Empoyee Id is :"+getId());
		System.out.println("Empoyee Name is :"+getName());
		System.out.println("Empoyee Salary is :"+getSalary());
	}
	
}
public class test2 {

	public static void main(String[] args) {
		employee e1;
		e1=new employee();
		
		e1.setId(100);
		e1.setName("Akshay");
		e1.setSalary(55000);
		
		e1.display();
	}

}
