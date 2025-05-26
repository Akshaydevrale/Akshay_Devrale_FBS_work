package inheritence;

class Shape{
	double area;
	
	Shape(){
		this.area=0;
	}
	Shape(double area) {
		super();
		this.area = area;
	}
	double getArea() {
		return area;
	}
	void setArea(double area) {
		this.area = area;
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
		super();
		this.height=11;
		this.base=3;
	}
	Triangle(double area,int height, int base) {
		super(area);
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
		this.area=0.5*height*base;
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
		super();
		this.radius=4;
	}
	Circle(double area,double radius) {
		super(area);
		this.radius = radius;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	double calculate() {
		this.area=3.14*radius*radius;
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
	Rectangle(double area,int length, int width) {
		super(area);
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
		this.area=length*width;
		return area;
	}
	void display() {
		System.out.println(" ");
		super.display();
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}
}

public class Shapesinheritence {

	public static void main(String[] args) {
		
		Triangle t1=new Triangle();
		
		t1.setHeight(10);
		t1.setBase(5);
		t1.calculate();
		t1.display();
		
		Circle c1=new Circle();
		
		c1.setRadius(6);
		c1.calculate();
		c1.display();
		
		Rectangle r1=new Rectangle();
		
		r1.setLength(20);
		r1.setWidth(10);
		r1.calculate();
		r1.display();

	}

}
