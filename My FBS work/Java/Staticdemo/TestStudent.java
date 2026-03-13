package staticKeyword;

class Student {
	String name;
	int age;
	static String collegName;
	
	static {
		collegName="Not given";
	}
	
	Student(){
		this.name="Not given";
		this.age=1;
	}
	Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	static String getCollegName() {
		return collegName;
	}
	static void setCollegName(String collegName) {
		Student.collegName = collegName;
	}
	public String toString() {
		return "Name:"+name+" Age:"+age+" College Name:"+collegName;
	}
}  

public class TestStudent {
	public static void main(String[] args) {
		Student s1,s2,s3;
		Student.setCollegName("KCES'S MJ College");

		s1=new Student("Raman",23);
		System.out.println(s1.toString());
		s2=new Student("Mayur",22);
		System.out.println(s2.toString());
		s3=new Student("Pritam",23);
		System.out.println(s3.toString());
	}
}
