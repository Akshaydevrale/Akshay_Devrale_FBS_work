package arrayOfObjects;

class Student {
	int roll;
	String name;
	double marks;
	
	Student(){
		this.roll=1;
		this.name="Not given";
		this.marks=35;
	}
	Student(int roll,String name,double marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	int getRoll() {
		return roll;
	}
	void setRoll(int roll) {
		this.roll = roll;
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
	void display() {
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
}  //class Student ends here

public class TestStudent {
	public static void main(String[] args) {
		Student[] arrStud=new Student[5];
		
		arrStud[0]=new Student(101,"Vinit",89.20);
		arrStud[1]=new Student(102,"Lokesh",77);
		arrStud[2]=new Student(103,"Gaurav",88.88);
		arrStud[3]=new Student(104,"Sai",79);
		arrStud[4]=new Student(105,"Aditya",68.92);
		
		for (int i = 0; i < arrStud.length; i++) {
			System.out.println("Student "+(i+1)+" Details...");
			arrStud[i].display();
			System.out.println();
		}
		
	}
}
