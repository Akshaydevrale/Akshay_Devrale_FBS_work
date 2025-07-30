package map;

import java.util.*;

class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "Id: "+id+" Name: "+name+" Salary: "+salary+"\n";
	}

}//class Employee ends here

class MyKey implements Comparable{
	int key;
	
	MyKey(int key){
		super();
		this.key=key;
	}
	@Override
	public String toString() {
		return "MyKey: "+key;
	}
	@Override
	public int compareTo(Object o) {
		MyKey m1=(MyKey)o;
		return this.key-m1.key;
	}
}//class mykey ends here

public class Treemap {

	public static void main(String[] args) {
		Employee e1=new Employee(33,"Hardik",33000);
		Employee e2=new Employee(93,"Jassi",45000);
		Employee e3=new Employee(45,"Hitman",93000);
		
		Map m1=new TreeMap<MyKey, Employee>();
			
		m1.put(new MyKey(33),e1);
		m1.put(new MyKey(93),e2);
		m1.put(new MyKey(45),e3);
		
		System.out.println(m1);
		
	}

}
