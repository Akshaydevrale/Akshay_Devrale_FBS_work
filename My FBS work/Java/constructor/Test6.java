package constructor;

class Date {
	int day;
	int month;
	int year;
	String dow;
	
	Date(){
		this.day=5;
		this.month=5;
		this.year=2025;
		this.dow="Tuesday";
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	String getDow() {
		return dow;
	}

	void setDow(String dow) {
		this.dow = dow;
	}
	void display() {
		System.out.println(getDay());
		System.out.println(getMonth());
		System.out.println(getYear());
		System.out.println(getDow());
	}
}

public class Test6 {

	public static void main(String[] args) {
		Date d1;
		d1=new Date();
		d1.display();
	}

}
