package Functionoverloading;

class Divide{
	
	void div(int a,int b) {
		System.out.println("Division is:"+(a/b));
	}
	void div(double a1,double a2){
		System.out.println("Division is:"+(a1/a2));
	}
	void div(int b1,double b2) {
		System.out.println("Division is:"+(b1/b2));
	}
	void div(double c1,int c2) {
		System.out.println("Division is:"+(c1/c2));
	}
}

public class Division {

	public static void main(String[] args) {
		Divide d1=new Divide();
		
		int a=100,b=5;
		d1.div(a,b);
		
		double a1=50,a2=10;
		d1.div(a1,a2);
		
		int b1=1000;
		double b2=10;
		d1.div(b1,b2);
		
		double c1=500;
		int c2=5;
		d1.div(c1,c2);
		
	}

}
