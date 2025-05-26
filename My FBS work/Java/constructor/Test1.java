package constructor;

class Student{
	int id;
	String name;
	int marks;
	
	Student(){
		this.id=111;
		this.name="Akshay";
		this.marks=67;
	}

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
	void display() {
		System.out.println("Id: "+getId());
		System.out.println("Name: "+getName());
		System.out.println("Marks: "+getMarks());
	}
}

public class Test1 {

	public static void main(String[] args) {
		Student s1;
		s1=new Student();
		s1.display();
	}

}
