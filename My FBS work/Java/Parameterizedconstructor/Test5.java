package Parameterizedconstructor;

class Salesmanager{
	int id;
	String name;
	int salary,incentive,target;
	
	Salesmanager(int id,String name,int salary,int incentive,int target)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.incentive=incentive;
		this.target=target;
	}
	Salesmanager(){
		this.id=45;
		this.name="rahul";
		this.salary=33000;
		this.incentive=3884;
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
