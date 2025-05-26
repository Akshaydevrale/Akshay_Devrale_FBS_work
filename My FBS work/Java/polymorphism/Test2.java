package polymorphism;

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
	double calsal() {
		return salary;
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
	double calsal() {
		salary=salary+incentive;
		return salary;
	}
	void display() {
		System.out.println(" ");
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

	hr(int id,String name,double salary,int commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	int getCommission() {
		return commission;
	}

	void setCommission(int commission) {
		this.commission = commission;
	}
	double calsal() {
		salary=salary+commission;
		return salary;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Commision:"+commission);
	}
}//class hr ends here

class Admin extends Employee{
	int allowance;
	
	Admin(){
		this.allowance=45;
	}

	Admin(int id,String name,double salary,int allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Allowance:"+allowance);
	}
}//class Admin ends here

public class Test2 {

	public static void main(String[] args) {
	
		Employee e1;	//generic reference
		e1=new salesmanager(100,"Spider",45000,10000,50);	//upcasting
		e1.calsal();
		e1.display();
		
		e1=new hr(20,"Dhobi",50000,25000);	//upcasting
		e1.calsal();
		e1.display();
		
		e1=new Admin(111,"Sevenkar",67000,3000);	//upcasting
		e1.calsal();
		e1.display();
		
	}
	

}
