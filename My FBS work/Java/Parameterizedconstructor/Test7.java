package Parameterizedconstructor;

class Time{
	int hour,minute,second;
	
	Time(){
		this.hour=3;
		this.minute=35;
		this.second=45;
	}
	Time(int hour,int minute,int seconde){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
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
	void display() {
		System.out.println("Time is: "+getHour()+":"+getMinute()+":"+getSecond());
	}
}

public class Test7 {

	public static void main(String[] args) {
		Time t1;
		t1=new Time();
		t1.display();
	}

}
