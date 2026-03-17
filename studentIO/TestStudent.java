package studentIO;

class Student {
	int roll;
	String name;
	double marks;

	Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	void setRoll(int roll) {
		this.roll = roll;
	}

	int getRoll() {
		return roll;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setMarks(double marks) {
		this.marks = marks;
	}

	double getMarks() {
		return marks;
	}

	public String toString() {
		return "Roll:" + roll + " Name:" + name + " Marks:" + marks;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		

	}

}
