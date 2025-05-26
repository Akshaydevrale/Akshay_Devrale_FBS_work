package Functionoverloading;

class Shape{
	
	void tringle1(int base,int height) {
		double c=0.5*base*height;
		System.out.println("Area of tringle: "+c);
	}
	void rectangle(int length, int breadth) {
		System.out.println("Area of rectangle: "+(length*breadth));
	}
	void circle(int radius) {
		double c=3.14*radius*radius;
		System.out.println("Area of circle: "+c);
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		Shape s1;
		s1=new Shape();
		
		s1.tringle1(10,20);
		s1.rectangle(5,10);
		s1.circle(5);
	}

}

