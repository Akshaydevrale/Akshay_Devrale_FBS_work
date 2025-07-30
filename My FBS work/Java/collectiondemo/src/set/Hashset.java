package set;

import java.util.*;

class Student0 {
	int id;
	String name;

	Student0(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int hashCode() {
		System.out.println("In hashCode");
		return this.id;
	}

	public boolean equals(Object obj) {
		System.out.println("In equals");
		Student0 s1 = (Student0) obj;
		if (this.id==s1.id) 
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	public String toString() {
		return " Id: " + id + " Name: " + name;
	}
	
}// class Student0 ends here

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Student0> studentlist = new HashSet<Student0>();

		studentlist.add(new Student0(45, "Rohit"));
		studentlist.add(new Student0(63, "sky"));
		studentlist.add(new Student0(63, "Thala"));
		studentlist.add(new Student0(93,"Jassi"));
		studentlist.add(new Student0(18,"Virat"));
		studentlist.add(new Student0(18,"Virat"));
		

		for (Student0 s1 : studentlist) {
			System.out.println(s1);
		}

	}

}
