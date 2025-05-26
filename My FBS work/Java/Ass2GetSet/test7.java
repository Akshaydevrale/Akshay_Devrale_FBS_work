package Ass2GetSet;

class time{
	int hour,minute,second;
	
	int getHour() {
		return hour;
	}
	void setHour(int hour) {
		this.hour = hour;
	}
	int getMinute() {
		return minute;
	}
	void setMinute(int minute) {
		this.minute = minute;
	}
	int getSecond() {
		return second;
	}
	void setSecond(int second) {
		this.second = second;
	}
	void display(){
		System.out.println(getHour());
		System.out.println(getMinute());
		System.out.println(getSecond());
	}
	
}

public class test7 {

	public static void main(String[] args) {
		
		time t1;
		t1=new time();
		
		t1.setHour(7);
		t1.setMinute(15);
		t1.setSecond(49);
		
		t1.display();
		
	}

}
