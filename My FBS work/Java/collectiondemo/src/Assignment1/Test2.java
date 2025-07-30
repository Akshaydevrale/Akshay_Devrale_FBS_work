package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
	int roll;
	String name;
	double marks;
	
	Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Roll: "+roll+" Name: "+name+" Marks: "+marks+"\n";
	}
	
}//class Student ends here

class CompareRoll implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.roll-s2.roll;
	}

}//class CompareId ends here
class CompareMarks implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return Double.compare(s1.marks, s2.marks);
	}

}//class CompareMarks ends here
class CompareName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}

}//class CompareName ends here
public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Student> l1=new ArrayList<Student>();
		l1.add(new Student(10,"Sachin",99));
		l1.add(new Student(7,"Thala",35));
		l1.add(new Student(45,"Rohit",79));
		l1.add(new Student(18,"virat",55));

		int choice;
		do {
			System.out.println("1. Display All Student");
			System.out.println("2. Sort by Roll");
			System.out.println("3. Sort by Marks");
			System.out.println("4. Sort by Name");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
		
			switch(choice) {
				case 1:
				{
					System.out.println("List of Student");
					for(Student s1:l1)
					{
						System.out.println(s1);
					}
				}
				break;
				case 2:
					System.out.println("Sort by Id");
					Collections.sort(l1, new CompareRoll());
					System.out.println(l1);
					break;
				case 3:
					System.out.println("Sort by Marks");
					Collections.sort(l1, new CompareMarks());
					System.out.println(l1);
				break;
				case 4:
					System.out.println("Sort by Name");
					Collections.sort(l1, new CompareName());
					System.out.println(l1);
				break;
				
				default:
					System.out.println("Invalid Choice...");
					break;
			}		
		}while(choice !=3);
		sc.close();

	}

}
		
		
		
		
		
		
		
//		List<Student> l1=new ArrayList<Student>();
//		l1.add(new Student(10,"Sachin",99));
//		l1.add(new Student(7,"Thala",35));
//		l1.add(new Student(45,"Rohit",79));
//		l1.add(new Student(18,"virat",55));
//		
//		System.out.println("List of Student");
//		for(Student s1:l1)
//		{
//			System.out.println(s1);
//		}
//		
//		System.out.println("Sort by Marks");
//		Collections.sort(l1, new CompareMarks());
//		System.out.println(l1);
//		
//		System.out.println("Sort by Name");
//		Collections.sort(l1, new CompareName());
//		System.out.println(l1);
	
