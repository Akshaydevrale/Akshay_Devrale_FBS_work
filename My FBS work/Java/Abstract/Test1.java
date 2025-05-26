package Abstract;

abstract class Employee{
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
	abstract double calculate();
	
	@Override
	public String toString() {
		return "Id:"+id+"  Name:"+name+"  Salary:"+salary;
	}
	
}//class Employee ends here

 class Salesmanager extends Employee
{
	int incentive;
	int target;
	
	Salesmanager(){
		
		super();
		this.incentive=10000;
		this.target=99;
	}
	Salesmanager(int id,String name,double salary,int incentive, int target) {
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
	double calculate() {
		salary=salary+incentive;
		return salary;
	}
	@Override
	public String toString() {
		System.out.println("Salesmanager:");
		return super.toString()+" Incentive:" + incentive + "  Target=" + target;
	}
	
}//class salesmanger ends here

class Hr extends Employee
{
	int commission;
	
	Hr(){
		super();
		this.commission=20000;
	}

	Hr(int id,String name,double salary,int commission) {
		super(id,name,salary);
		this.commission = commission;
	}
	int getCommission() {
		return commission;
	}

	void setCommission(int commission) {
		this.commission = commission;
	}
	double calculate() {
		salary=salary+commission;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString()+"  Commission:" + commission;
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
	double calculate() {
		salary=salary+allowance;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString()+"  Allowance:" + allowance;
	}
	
}//class Admin ends here

public class Test1 {

	public static void main(String[] args) {
	
		Employee e1;	//generic reference
		e1=new Salesmanager(10,"Tony",45000,20000,100);
		e1.calculate();
		System.out.println(e1);

		e1=new Hr(11,"Johnsena",55000,22000);
		e1.calculate();
		System.out.println(e1);
		
		e1=new Admin(12,"Marco",33000,7000);
		e1.calculate();
		System.out.println(e1);
	}
	

}

