package Ass2GetSet;

class SalesManager{
	int id;
	String name;
	int salary;
	int incentive;
	int target;
	
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
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive=incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target=target;
	}
	void display() {
		System.out.println("Id :"+getId());
		System.out.println("Name :"+getName());
		System.out.println("Salary :"+getSalary());
		System.out.println("Incentive :"+getIncentive());
		System.out.println("Target :"+getTarget());
	}
}
public class test5 {

	public static void main(String[] args) {
		SalesManager s1;
		s1=new SalesManager();
		s1.setId(222);
		s1.setName("Marco");
		s1.setSalary(63000);
		s1.setIncentive(2500);
		s1.setTarget(100);
		
		s1.display();
	}

}
