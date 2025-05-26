package Array;

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(){
		this.id=1;
		this.name="Not given";
		this.salary=20;
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
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
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary=salary;
	}
	void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	
}//class Employee ends here

class Salesmanager extends Employee{
	double incentive;
	int target;
	
	Salesmanager(){
		super();
		this.incentive=1;
		this.target=2;
	}
	Salesmanager(int id,String name,double salary,double incentive,int target){
		super(id,name,salary);
		this.incentive=incentive;
		this.target=target;
	}
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display() {
		super.display();
		System.out.println("Incentive:"+incentive);
	}
}//class salesmanager ends here

class Hr extends Employee{
	double commission;
	
	Hr(){
		this.commission=5;
	}
	Hr(int id,String name,double salary,double commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}
	void display() {
		super.display();
		System.out.println("Commission:"+commission);
	}
}//class Hr ends here

class Admin extends Employee{
	double allowance;

	Admin() {
		super();
		this.allowance=6;
	}
	Admin(int id, String name, double salary,double allowance) {
		super(id, name, salary);
		this.allowance=allowance;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	void display() {
		super.display();
		System.out.println("Allowance:"+allowance);
	}
}//class Admin ends here

public class Test1 {
	
	public static void main(String[] args) {
		Employee[] arrEmp;
		arrEmp=new Employee[3];
		
		
		arrEmp[0]=new Salesmanager(111,"Akki",63000,7000,10);
		arrEmp[1]=new Hr(101,"Marco",55000,15000);
		arrEmp[2]=new Admin(100,"Tony",45000,5000);
		
		for(int i=0;i<arrEmp.length;i++) {
			arrEmp[i].display();
		}

	}
}







