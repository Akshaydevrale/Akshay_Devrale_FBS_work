package Parameterizedconstructor;

class Distance{
	int feet,inch;
	
	Distance(){
		this.feet=2;
		this.inch=24;
	}
	Distance(int feet,int inch){
		this.feet=feet;
		this.inch=inch;
	}
	int getFeet() {
		return feet;
	}
	void setFeet(int feet) {
		this.feet=feet;
	}
	int getInch() {
		return inch;
	}
	void setInch(int inch) {
		this.inch=inch;
	}
	void display() {
		System.out.println("Feet: "+getFeet()+" Inch: "+getInch());
	}
}

public class Test8 {

	public static void main(String[] args) {
		Distance d1;
		d1=new Distance();
		d1.display();
	}

}
