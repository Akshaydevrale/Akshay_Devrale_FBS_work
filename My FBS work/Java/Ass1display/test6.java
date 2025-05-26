package Ass1display;

class employee{
	int id,age,experience;
	void display() {
		System.out.printf("Id:%d Age:%d Experience:%d",this.id,this.age,this.experience);
	}
}

public class test6 {

	public static void main(String[] args) {
		employee e1;
		e1=new employee();
		
		e1.id=101;
		e1.age=22;
		e1.experience=1;
		
		e1.display();
	}

}

