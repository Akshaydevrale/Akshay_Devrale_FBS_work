package inheritence;

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(){
		this.id=99;
		this.name="not given";
		this.salary=45000;
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
	void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	
	
}//class Employee ends here

class salesmanager extends Employee
{
	int incentive;
	int target;
	
	salesmanager(){
		
		super();
		this.incentive=10000;
		this.target=99;
	}

	salesmanager(int id,String name,double salary,int incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
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
		System.out.println("Salesmanager Details:-");
		super.display();
		System.out.println("Incentive:"+incentive);
		System.out.println("Target:"+target);
	}
	
}//class salesmanger ends here

class hr extends Employee
{
	int commission;
	
	hr(){
		super();
		this.commission=20000;
	}

	hr(int commission) {
		super();
		this.commission = commission;
	}

	int getCommission() {
		return commission;
	}

	void setCommission(int commission) {
		this.commission = commission;
	}
	void display() {
		System.out.println("Hr Details:-");
		super.display();
		System.out.println("Commision:"+commission);
	}
}//class hr ends here

class Admin extends Employee{
	int allowance;
	
	Admin(){
		this.allowance=45;
	}

	Admin(int allowance) {
		super();
		this.allowance = allowance;
	}

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	void display() {
		System.out.println("Admin Details:-");
		super.display();
		System.out.println("Allowance:"+allowance);
	}
}//class Admin ends here

public class employeeinheritence {

	public static void main(String[] args) {
		
		salesmanager s1=new salesmanager();//salesmanager object
		
		s1.setId(20);
		s1.setName("Tamble");
		s1.setSalary(45000);
		s1.setIncentive(1200);
		s1.setTarget(100);
		s1.display();
		
		hr h1=new hr();//hr object 
		
		h1.setId(99);
		h1.setName("indori");
		h1.setSalary(55000);
		h1.setCommission(3000);
		h1.display();
		
		Admin a1=new Admin();//Admin object
		
		a1.setId(35);
		a1.setName("Tony stark");
		s1.setSalary(38484);
		a1.setAllowance(123);
		a1.display();
	}

}
