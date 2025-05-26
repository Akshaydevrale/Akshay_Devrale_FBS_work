package polymorphism;

class Shape{
	double area;
	
	Shape(){
		this.area=0;
	}
	double getArea() {
		return area;
	}
	void setArea(double area) {
		this.area = area;
	}
	double calculate() {
		return area;
	}
	void display() {
		System.out.println("Area:"+area);
	}
}//super class shape ends here

class Triangle extends Shape
{
	int height;
	int base;
	
	Triangle(){
		this.height=11;
		this.base=3;
	}
	Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	int getBase() {
		return base;
	}
	void setBase(int base) {
		this.base = base;
	}
	double calculate() {
		area=0.5*height*base;
		return area;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Height: "+height);
		System.out.println("Base: "+base);
	}
	
}//class Triangle ends here

class Circle extends Shape
{
	double radius;
	
	Circle(){
		this.radius=4;
	}
	Circle(double radius) {
		super();
		this.radius = radius;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	double calculate() {
		area=3.14*radius*radius;
		return area;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Radius: "+radius);
	}
}//class Circle ends here

class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(){
		super();
		this.length=11;
		this.width=22;
	}
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	double calculate() {
		area=length*width;
		return area;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}
}


public class Test3 {

	public static void main(String[] args) {
		
		Shape s1;	//generic reference
		s1=new Triangle(10,5);	//upcasting
		s1.calculate();
		s1.display();
		
		s1=new Circle(5);
		s1.calculate();
		s1.display();
		
		s1=new Rectangle(10,5);
		s1.calculate();
		s1.display();
	}

}
