package Ass1display;

class distance{
	int feet,inch;
	
	void display()
	{
		System.out.printf("Distance is :%d Feet %d Inch",this.feet,this.inch);
	}
}

public class test3 {

	public static void main(String[] args) {
		distance d1;
		
		d1=new distance();
		
		d1.feet=20;
		d1.inch=10;
		
		d1.display();
	}

}
