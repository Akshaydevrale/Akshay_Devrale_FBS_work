package Assignment1;

import java.util.*;

class Employee implements Comparable{
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public boolean equals(Object obj) {
		Employee e1=(Employee)obj;
		if(this.id==e1.id) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public int compareTo(Object o) {
		Employee e1=(Employee)o;
		return this.id-e1.id;
	}
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name+" Salary: "+salary;
	}
	
}//class Employee ends here

class CompareSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.salary, o2.salary);
	}

}

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Employee> employeelist=new ArrayList<Employee>();
		
		employeelist.add(new Employee(45,"Rohit",45000));
		employeelist.add(new Employee(18,"Virat",63000));
		employeelist.add(new Employee(63,"Sky",3999));
		employeelist.add(new Employee(33,"Hardik",18000));
		
		int choice;
		do {
			System.out.println("\n----Employee Menu----");
			System.out.println("1. Display All Employees");
			System.out.println("2. Search by Id");
			System.out.println("3. Search by Name");
			System.out.println("4. Sorted by Id");
			System.out.println("5. Sorted by Salary");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Employee List");
					for(Employee e1:employeelist) {
						System.out.println(e1);
					}
					break;
					
				case 2:
					System.out.println("Enter Id to search: ");
					int searchId=sc.nextInt();
					if(employeelist.contains(new Employee(searchId," ",0))) 
					{
						System.out.println("Id found"+searchId);
					}
					else
					{
						System.out.println("In not found");
					}
					break;
					
				case 3:
					System.out.println("Enter name to search:");
					sc.nextLine();
					String Name=sc.nextLine();
					boolean found=false;
					for(Employee e1:employeelist) {
						if(e1.name.equals(Name))
						{
							System.out.println("Found "+e1);
							found = true;
						}
					}
					if(!found) 
					{
						System.out.println("Not found");
					}
					break;
				
				case 4:
					System.out.println("Sort by Id");
					TreeSet<Employee> empbyId=new TreeSet<Employee>(employeelist);
					System.out.println("Employees sort by Id:");
					for(Employee e1:empbyId) {
						System.out.println(e1);
					}
					break;
					
				case 5:
					System.out.println("Sort by Salary");
					TreeSet<Employee> empbySalary=new TreeSet<Employee>(new CompareSalary());
					empbySalary.addAll(employeelist);
					System.out.println("Employees sort by Salary:");
					for(Employee e1:empbySalary) {
						System.out.println(e1);
					}
					break;
				
				case 6:
					break;
					
				default:
					System.out.println("Invalid Choice...");
					break;
			}
		} while(choice !=6);
		 
		sc.close();
	}

}
