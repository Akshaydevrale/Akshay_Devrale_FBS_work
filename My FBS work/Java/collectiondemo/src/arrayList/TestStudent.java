package arrayList;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int roll;
	String name;
	double marks;
	
	Student(int roll,String name,double marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	void setRoll(int roll) {
		this.roll=roll;
	}
	int getRoll() {
		return roll;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getMarks() {
		return marks;
	}
	void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Roll:"+roll+" Name:"+name+" Marks:"+marks+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s1=(Student)obj;
		if(this.roll==s1.roll) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Student o) {
		return this.roll - o.roll;
	}
	
}// class Student ends here

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> arraylist=new ArrayList<>();
		
		arraylist.add(new Student(123,"Raman",98));
		arraylist.add(new Student(111,"Mayur",87));
		arraylist.add(new Student(101,"Nikhil",77));
		arraylist.add(new Student(103,"Pritam",88));
		arraylist.add(new Student(102,"Tony",55));
		
	/*	System.out.println(arraylist);
		System.out.println(arraylist.size());
		System.out.println(arraylist.remove(2));
		System.out.println(arraylist);
		arraylist.set(2, new Student(222,"Nikhil",35));      //this is the limitation of arraylist we dont know storage is available or not at beside of last arraylist element
		System.out.println(arraylist);
	*/
	
		System.out.println(arraylist);
		
		System.out.println();
		
		Collections.sort(arraylist);
		System.out.println(arraylist);
		
		if(arraylist.contains(new Student(100,"",0))) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
		
	}

}
