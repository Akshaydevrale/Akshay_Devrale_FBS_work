package treeSet;
import java.util.TreeSet;

class Student implements Comparable {
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

	@Override
	public int compareTo(Object o) {
		Student s1=(Student)o;
		return this.roll-s1.roll;
	}
	
}  //class Student ends here

public class TestStudent {

	public static void main(String[] args) {
		
		TreeSet<Student> ts=new TreeSet<>();
		
		ts.add(new Student(45,"Rohit",87));
		ts.add(new Student(100,"Sachin",99));
		ts.add(new Student(18,"Virat",92));
		ts.add(new Student(7,"Mahendra",69));
		
		
		System.out.println(ts);
		
		if(ts.contains(new Student(18,"",0))) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
	
	}

}
