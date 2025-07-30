package list;

import java.util.*;

class Student5 {
	int id;
	String name;

	Student5(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object obj) {
		Student5 s1 = (Student5) obj;
		if (this.id == s1.id) 
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
}
public class Equals {

	public static void main(String[] args) {
		
		List<Student5> studentlist = new ArrayList<Student5>();

		studentlist.add(new Student5(45, "Rohit"));
		studentlist.add(new Student5(63, "sky"));
		studentlist.add(new Student5(6, "Thala"));

		for (Student5 s1 : studentlist) {
			System.out.println(s1);
		}

		if (studentlist.contains(new Student5(45, "Rohit"))) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}
