package set;

import java.util.*;

class Student1 implements Comparable{
	int id;
	String name;
	
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int compareTo(Object o) {
		Student1 s1=(Student1)o;//downcast
		return this.id-s1.id;
	}
	public String toString() {
		return " Id: "+id+" Name: "+name;
	}
}//class student1 ends here

public class Test {
	
	public static void main(String []argss) {
		
		TreeSet<Student1> studentlist=new TreeSet<Student1>();
		
		studentlist.add(new Student1(45,"Rohit"));
		studentlist.add(new Student1(63,"sky"));
		studentlist.add(new Student1(6,"Thala"));
		
		for(Student1 s1:studentlist) {
			System.out.println(s1);
		}
	}

}
