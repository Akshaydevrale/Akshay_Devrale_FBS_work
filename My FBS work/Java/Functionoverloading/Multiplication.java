package Functionoverloading;

class Multiply{
	
	void mul(int a,int b) {
		System.out.println("Multiplication is:"+(a*b));
	}
	void mul(double a1,double a2) {
		System.out.println("Multiplication is:"+(a1*a2));
	}
	void mul(int b1,double b2) {
		System.out.println("Multiplication is:"+(b1*b2));
	}
	void mul(double c1,int c2) {
		System.out.println("Multiplication is:"+(c1*c2));
	}
	
}

public class Multiplication {

	public static void main(String[] args) {
		Multiply m1;
		m1=new Multiply();
		
		int a=10,b=10;
		m1.mul(a,b);
		
		double a1=20,a2=20;
		m1.mul(a1,a2);
		
		int b1=5;
		double b2=5;
		m1.mul(b1,b2);
		
		double c1=50;
		int c2=5;
		m1.mul(c1,c2);
	}

}
