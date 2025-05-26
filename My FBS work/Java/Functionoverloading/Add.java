package Functionoverloading;

class Addition{
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println("Answer:"+c);
	}
	void add(double a, double b) {
		double c=a+b;
		System.out.println("Answer:"+c);
	}
	void add(int a, double b) {
		double c=a+b;
		System.out.println("Answer:"+c);
	}
	void add(double b1,int b2){
		System.out.println("Answer:"+(b1+b2));
	}
}

public class Add {

	public static void main(String[] args) {
		Addition a1;
		a1=new Addition();
		
		int a=10,b=20;
		a1.add(a, b);
		
		double d1=8.9, d2=20.8;
		a1.add(d1,d2);
		
		int c1=30;
		double c2=3.5;
		a1.add(c1,c2);
		
		double b1=5.5;
		int b2=5;
		a1.add(b1, b2);

	}

}
