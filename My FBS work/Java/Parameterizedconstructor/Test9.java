package Parameterizedconstructor;

class Complex{
	int real;
	double imaginary;
	
	Complex(){
		this.real=4;
		this.imaginary=6.9;
	}
	Complex(int real, double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
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
		System.out.println("Real: "+getReal());
		System.out.println("Imaginary: "+getImaginary());
	}
}

public class Test9 {

	public static void main(String[] args) {
		Complex c1;
		c1=new Complex();
		c1.display();
	}

}
