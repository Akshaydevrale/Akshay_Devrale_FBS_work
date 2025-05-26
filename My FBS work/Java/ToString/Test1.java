package ToString;

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
	@Override
	public String toString() {
		return "id:"+id+"  Name:"+name+"  Salary:"+salary;
	}
	
}//class employee ends here
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
	@Override
	public String toString() {
		System.out.println("Salesmanager:");
		return super.toString()+"  Incentive:" + incentive + "  Target:" + target;
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
	@Override
	public String toString() {
		System.out.println("HR:");
		return super.toString()+"  Commission:" + commission;
	}
	
}//class hr ends here

class Admin extends Employee{
	int allowance;
	
	Admin(){
		this.allowance=10;
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
	@Override
	public String toString() {
		System.out.println("Admin:");
		return super.toString()+"  Allowance:" + allowance;
	}
	
	
}//class Admin ends here

public class Test1 {

	public static void main(String[] args) {
		Employee e1;
		e1=new salesmanager(10,"Tony",45000,20000,100);
		System.out.println(e1);
		
		e1=new hr();
		System.out.println(e1);
		
		e1=new Admin(45,"Spider",2500,300);
		System.out.println(e1);

	}

}
