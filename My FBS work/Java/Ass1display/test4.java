package Ass1display;

class complex{
	int real,imaginary;
	void display() {
		System.out.printf("%d %d",this.real,this.imaginary);
	}
}
public class test4 {

	public static void main(String[] args) {
		complex c1;
		c1=new complex();
		
		c1.real=10;
		c1.imaginary=99;
		
		c1.display();
	}

}

