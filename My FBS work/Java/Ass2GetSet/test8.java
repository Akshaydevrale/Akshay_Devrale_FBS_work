package Ass2GetSet;

class distance{
	int inch;
	int feet;
	
	int getInch() {
		return inch;
	}
	void setInch(int inch) {
		this.inch=inch;
	}
	int getFeet() {
		return feet;
	}
	void setFeet(int feet) {
		this.feet=feet;
	}
	void display() {
		System.out.println("Inch"+getInch());
		System.out.println();
	}
}
public class test8 {

	public static void main(String[] args) {
		distance d1;
		d1=new distance();
		
		d1.setInch(12);
		d1.setFeet(1);
		
		d1.display();
	}

}
