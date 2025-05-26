package constructor;

class Employee{
	int id;
	String name;
	int salary;
	
	Employee(){
		this.id=99;
		this.name="Spidee";
		this.salary=45000;
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
