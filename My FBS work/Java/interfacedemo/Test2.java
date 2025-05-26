package interfacedemo;

public interface Student{ //interface
	public void study();
	
}

class Employee implements Student{
	int id;
	String name;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Id:" + id + "  Name:" + name + "  Salary:" + salary;
	}
	public void work() {
		System.out.println(this.name+" is working...");
	}
	public void study() {
		System.out.println(this.name+" is studying...");
	}
	
} // class Employee ends here

public class Test2 {

	public static void main(String[] args) {
		Employee e1;
		e1=new Employee(1,"Tony",45000);
		e1.work();
		e1.study();
		Student s1=new Employee(2,"Spider",93000);
		s1.study();
	}

}
