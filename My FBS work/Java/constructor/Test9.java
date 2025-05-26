package constructor;

class complex {
	int real;
	double imaginary;
	
	complex(){
		this.real=3;
		this.imaginary=4.5;
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
		complex c1;
		c1=new complex();
		
		c1.display();
	}

}