package list;

import java.util.*;

class Student implements Comparable {
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int compareTo(Object o) {
		Student s1=(Student)o;//downcast
		return this.id-s1.id;
	}
	public String toString() {
		return " Id: "+id+" Name: "+name;
	}
	
}//class Students ends here

public class CompareTo {

	public static void main(String[] args) {
		
		List<Student> studentlist=new ArrayList<Student>();
		
		studentlist.add(new Student(45,"Rohit"));
		studentlist.add(new Student(63,"sky"));
		studentlist.add(new Student(6,"Thala"));
		
		Collections.sort(studentlist);
		
		for(Student s1:studentlist) {
			System.out.println(s1);
		}

	}

}
