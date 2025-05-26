package Ass1display;

class time{
	int hour,minute,second;
	
	void display()
	{
		System.out.printf("Time is = %d:%d:%d",this.hour,this.minute,this.second);
	}
	
}

public class test2 {

	public static void main(String[] args) {
		
		time t1;
		t1=new time();
		
		t1.hour=2;
		t1.minute=5;
		t1.second=25;
		
		t1.display();
		
	}

}
