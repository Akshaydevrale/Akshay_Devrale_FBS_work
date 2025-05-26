package Abstract;

abstract class Shape{
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
	abstract double calculate();
	@Override
	public String toString() {
		return "Area:" + area;
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
	Triangle(int height, int base) {
		super();
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
	@Override
	public String toString() {
		System.out.println("Triangle:");
		return super.toString()+"  Height:" + height + "  Base:" + base;
	}
	
	
}//class Triangle ends here

class Circle extends Shape
{
	double radius;
	
	Circle(){
		super();
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
		this.area=3.14*radius*radius;
		return area;
	}
	@Override
	public String toString() {
		System.out.println("Circle:");
		return super.toString()+"  Radius:" + radius;
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
		super();
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
	@Override
	public String toString() {
		System.out.println("Rectangle:");
		return super.toString()+"  Length:" + length + "  Width:" + width;
	}
	
}//class Rectangle ends here

public class Test2 {

	public static void main(String[] args) {
		Shape s1;
		s1=new Triangle(10,5);
		s1.calculate();
		System.out.println(s1);
		
		s1=new Circle(2);
		s1.calculate();
		System.out.println(s1);
		
		s1=new Rectangle(20,10);
		s1.calculate();
		System.out.println(s1);
		
	}

}
