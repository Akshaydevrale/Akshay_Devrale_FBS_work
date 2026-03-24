package linkedList;
import java.util.LinkedList;

class Student {
	int roll;
	String name;
	double marks;
	
	Student(int roll,String name,double marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	int getRoll() {
		return roll;
	}
	void setRoll(int roll) {
		this.roll=roll;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	double getMarks() {
		return marks;
	}
	void setMarks(double marks) {
		this.marks=marks;
	}
	
	public String toString() {
		return "Roll:"+roll+" Name:"+name+" Marks:"+marks+"\n";
	}
	
}  //class Student ends here

public class TestStudent {

	public static void main(String[] args) {
		
		LinkedList<Student> l1=new LinkedList<>();
		
		l1.add(new Student(45,"Rohit",87));
		l1.add(new Student(100,"Sachin",99));
		l1.add(new Student(18,"Virat",92));
		l1.add(new Student(7,"Mahendra",69));
		
		System.out.println(l1);
		l1.add(new Student(6,"Thala",69));
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.addFirst(new Student(6,"Thala",69));
		System.out.println(l1);
		System.out.println(l1.get(1));
		System.out.println(l1.size());
		
//		for(Student s:l1) {
//			System.out.println(s);
//		}
	}

}
