package constructor;

class Salesmanager{
	int id;
	String name;
	int salary;
	int incentive;
	int target;
	
	Salesmanager(){
		this.id=67;
		this.name="Akshay";
		this.salary=46000;
		this.incentive=1000;
		this.target=100;
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
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Salary: "+getSalary());
		System.out.println("Incentive: "+getIncentive());
		System.out.println("Target: "+getTarget());
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		Salesmanager s1;
		s1=new Salesmanager();
		s1.display();
	}

}
