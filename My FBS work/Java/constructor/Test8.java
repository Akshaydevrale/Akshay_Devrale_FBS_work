package constructor;

class Distance {
	int inch,feet;
	
	Distance(){
		this.inch=12;
		this.feet=1;
	}

	int getInch() {
		return inch;
	}

	void setInch(int inch) {
		this.inch = inch;
	}

	int getFeet() {
		return feet;
	}

	void setFeet(int feet) {
		this.feet = feet;
	}
	void display() {
		System.out.println("Inch: "+getInch()+" Feet: "+getFeet());
	}
}

public class Test8 {

	public static void main(String[] args) {
		Distance d1;
		d1=new Distance();
		d1.display();

	}

}
