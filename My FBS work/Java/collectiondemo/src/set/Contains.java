package set;

import java.util.*;

class Students implements Comparable {
	int id;
	String name;

	Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Object o) {
		Students s1 = (Students) o;// downcast
		return this.id - s1.id;
	}

	public String toString() {
		return " Id: " + id + " Name: " + name;
	}
	
}// class Students ends here

public class Contains {

	public static void main(String[] args) {

		TreeSet<Students> studentlist = new TreeSet<Students>();

		studentlist.add(new Students(45, "Rohit"));
		studentlist.add(new Students(63, "sky"));
		studentlist.add(new Students(6, "Thala"));

		for (Students s1 : studentlist) {
			System.out.println(s1);
		}
		
		if(studentlist.contains(new Students(45,"Rohit"))) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}

}
