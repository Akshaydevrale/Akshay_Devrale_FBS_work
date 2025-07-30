package list;

import java.util.*;

class Employee implements Comparable {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary=salary;
	}

	public int compareTo(Object o) {
		Employee e1 = (Employee) o;// downcast
		return this.id - e1.id;
	}

	public String toString() {
		return " Id: " + id + " Name: " + name +" Salary: "+salary;
	}
}// class Employee ends here

public class Test4 {

	public static void main(String[] args) {
		
		List<Employee> employeelist=new ArrayList<Employee>();
		
		employeelist.add(new Employee(45,"Rohit",45000));
		employeelist.add(new Employee(63,"sky",3384));
		employeelist.add(new Employee(6,"Thala",234234));
		
		for(Employee e1:employeelist) {
			System.out.println(e1);
		}
		if (employeelist.contains(new Employee(45, "Rohit",45000))) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}
