package downcasting;

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(){
		this.id=1;
		this.name="Not given";
		this.salary=10000;
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	void setSalary(int salary) {
		this.salary=salary;
	}
	double getSalary() {
		return salary;
	}
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}// class employee ends here

class Admin extends Employee{
	double incentive;
	int target;
	
	Admin(){
		this.incentive=2000;
		this.target=50;
	}
	Admin(int id,String name,int salary,double incentive,int target){
		super(id,name,salary);
		this.incentive=incentive;
		this.target=target;
	}
	void setIncentive(double incentive) {
		this.incentive=incentive;
	}
	double getIncentive() {
		return incentive;
	}
	void setTarget(int target) {
		this.target=target;
	}
	int getTarget() {
		return target;
	}
	void adminSalary() {
		System.out.println("Admin Total Salary:"+(salary+incentive));
	}
	void display() {
		super.display();
		System.out.println("Incentive: "+incentive);
		System.out.println("Target: "+target);
	}
}//class Adming ends here

class SalesManager extends Employee{
	double allowance;
	
	SalesManager() {
		this.allowance=15000;
	} 
	SalesManager(int id,String name,double salary,double allowance){
		super(id,name,salary);
		this.allowance=allowance;
	}
	void setAllowance(double allowance) {
		this.allowance=allowance;
	}
	double getAllowance() {
		return allowance;
	}
	void salesManagerSalary() {
		System.out.println("SalesManager Total Salary:"+(salary+allowance));
	}
	void display() {
		super.display();
		System.out.println("Allowance: "+allowance);
	}
}//class salesmanager ends here


class Hr extends Employee{
	double commission;
	
	Hr(){
		this.commission=3000;
	}
	Hr(int id,String name,double salary,double commission){
		this.commission=commission;
	}
	void setCommission(double commission) {
		this.commission=commission;
	}
	double getCommission() {
		return commission;
	}
	void hrSalary() {
		System.out.println("HR Total Salary:"+(salary+commission));
	}
	void display() {
		super.display();
		System.out.println("Commission: "+commission);
	}
} //class hr ends here

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Admin();
		Employee e2=new SalesManager();
		Employee e3=new Hr();
		e1.display();
		System.out.println();
		e2.display();
		System.out.println();
		e3.display();
		System.out.println();
		
		if(e1 instanceof Admin) {
			Admin a1=(Admin)e1;
			a1.adminSalary();
		}
		if(e2 instanceof SalesManager) {
			SalesManager s1=(SalesManager)e2;
			s1.salesManagerSalary();
		}
		if(e3 instanceof Hr) {
			Hr h1=(Hr)e3;
			h1.hrSalary();
		}

	}

}
