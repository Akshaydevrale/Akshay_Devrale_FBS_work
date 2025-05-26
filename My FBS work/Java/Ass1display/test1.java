package Ass1display;

class date{
	int day,month,year;
	
	void display()
	{
		System.out.printf("%d/%d/%d",this.day,this.month,this.year);
	}
	
}

public class test1 {

	public static void main(String[] args) {
		
		date d1;
		d1=new date();
		d1.day=2;
		d1.month=5;
		d1.year=2025;
		d1.display();

	}

}
