package Ass2GetSet;

class complex {
	int real;
	double imaginary;
	
	int getReal() {
		return real;
	}
	void setReal(int real) {
		this.real=real;
	}
	double getImaginary() {
		return imaginary;
	}
	void setImaginary(double imaginary) {
		this.imaginary=imaginary;
	}
	void display() {
		System.out.println("Real"+getReal());
		System.out.println("Imaginary"+getImaginary());
	}
}
public class test9 {

	public static void main(String[] args) {
		complex c1;
		c1=new complex();
		
		c1.setReal(3);
		c1.setImaginary(2.8);
		
		c1.display();
	}

}
