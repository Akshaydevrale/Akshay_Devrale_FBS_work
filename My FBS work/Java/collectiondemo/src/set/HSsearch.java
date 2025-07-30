package set;

import java.util.*;

class Student {
	int roll;
	String name;

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int hashCode() {
		return this.roll;
	}

	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		if (this.roll == s1.roll) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Roll no: " + roll + " Name:" + name;
	}
}//class student ends here

public class HSsearch {

	public static void main(String[] args) {
		HashSet<Student> s1 = new HashSet<Student>();
		s1.add(new Student(45, "Tony"));
		s1.add(new Student(18, "Rocky"));
		s1.add(new Student(93, "Marco"));
		s1.add(new Student(63, "Sky"));

		if (s1.contains(new Student(93, "Marco"))) 
		{
			System.out.println("Found");
		} 
		else 
		{
			System.out.println("Not Found");
		}
	}

}
