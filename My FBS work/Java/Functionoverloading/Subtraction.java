package Functionoverloading;

class Sub{
	
	void sub(int a,int b) {
		System.out.println("Ans:"+(a-b));
	}
	void sub(double a1,double a2) {
		System.out.println("Ans:"+(a1-a2));
	}
	void sub(int b1, double b2) {
		System.out.println("Ans:"+(b1-b2));
	}
	void sub(double d1,int d2) {
		System.out.println("Ans:"+(d1-d2));
	}
	
}

public class Subtraction {

	public static void main(String[] args) {
		Sub s1=new Sub();
		
		int a=20,b=10;
		s1.sub(a,b);
		
		double a1=100,a2=50;
		s1.sub(a1,a2);
		
		int b1=30;
		double b2=15;
		s1.sub(b1,b2);
		
		double d1=10;
		int d2=5;
		s1.sub(d1,d2);
	}

}
