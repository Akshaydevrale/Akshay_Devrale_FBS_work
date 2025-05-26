package Ass2GetSet;

class Student{
	int id;
	String name;
	int marks;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getMarks() {
		return marks;
	}
	void setMarks(int marks) {
		this.marks = marks;
	}
	void display(){
		System.out.println("Student is a Id :"+getId());
		System.out.println("Student is a Name :"+getName());
		System.out.println("Student is a Marks :"+getMarks());
	}
	
}

public class test1 {

	public static void main(String[] args) {
		Student s1;
		s1=new Student();
		
		s1.setId(101);
		s1.setName("Akshay");
		s1.setMarks(77);
		
		s1.display();
		
	}

}
