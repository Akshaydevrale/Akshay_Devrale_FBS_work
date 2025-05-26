package Ass2GetSet;

class date{
	int day;
	String month;
	int year;
	int getDay() {
		return day;
	}
	void setDay(int day) {
		this.day = day;
	}
	String getMonth() {
		return month;
	}
	void setMonth(String month) {
		this.month = month;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	
	void display() {
		System.out.println(getDay());
		System.out.println(getMonth());
		System.out.println(getYear());
	}
}
public class test6 {

	public static void main(String[] args) {
		date d1;
		d1=new date();
		
		d1.setDay(4);
		d1.setMonth("May");
		d1.setYear(2025);
		
		d1.display();
	}

}
