package Ass1display;

class rectangle{
	int length,width;
	void display() {
		System.out.printf("length is:%d & width is:%d",this.length,this.width);
	}
	
}
public class test5 {

	public static void main(String[] args) {
		rectangle r1;
		r1=new rectangle();
		
		r1.length=20;
		r1.width=10;
		
		r1.display();
	}

}
