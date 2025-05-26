package Functionoverloading;

class  Bank {

	void studentloan(Student s1) {
		if (s1.percentage >= 80) {
			System.out.println("Student loan are approved which is 2 lakh...");
		} else if (s1.percentage >= 60) {
			System.out.println("Student loan are approved which is 1 lakh...");
		} else if (s1.percentage >= 40) {
			System.out.println("Student loan are approved which is 50k...");
		} else {
			System.out.println("Student loan are not approved...");
		}
	}
	void employeeloan(Employee e1) {
		if (e1.salary >= 1200000) {
			System.out.println("Employee loan are approved which is 7 lakh...");
		} else if (e1.salary <= 1200000 && e1.salary >= 1000000) {
			System.out.println("Employee loan are approved which is 6 lakh...");
		} else if (e1.salary < 1000000 && e1.salary >= 600000) {
			System.out.println("Employee loan are approved which is 5 lakh...");
		}else if(e1.salary < 600000 && e1.salary >=400000){
			System.out.println("Employee loan are approved which is 4 lakh...");
		}else{
			System.out.println("Employee loan are not approved...");
		}

}


}// class ends here
class Student {
	int rollno;
	String name;
	double percentage;

}// class ends here

class Employee {
	int id;
	String name;
	double salary;

}// class ends here

public class Test3 {

		public static void main(String[] args) {

			Student s1= new Student();
			s1.rollno = 10;
			s1.name = "Tony Stark";
			s1.percentage = 67;
			
			Bank b=new Bank();
			b.studentloan(s1);
			
			
			Employee e1=new Employee();
			e1.id=20;
			e1.name="Spider";
			e1.salary=450000;
			
			b.employeeloan(e1);
			
	}
}
