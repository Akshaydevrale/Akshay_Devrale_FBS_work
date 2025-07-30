package f1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable {
	int id;
	String name;
	double marks;

	Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name+" Marks: "+marks;
	}
}//class Student ends here

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> studlist = new ArrayList<Student>();
		int no;
		
		File f1=new File("Myfile.txt");
		
		do {
			System.out.println("\n---Menu---");
			System.out.println("1. Add Student");
			System.out.println("2. Display all Students");
			no = sc.nextInt();
			
			switch(no) {
				case 1:
					System.out.println("Enter Id: ");
					int id=sc.nextInt();
					System.out.println("Enter Name: ");
					String name=sc.next();
					System.out.println("Enter Marks: ");
					double marks=sc.nextDouble();
					
					try {
						FileOutputStream fos=new FileOutputStream(f1);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(studlist);						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case 2:
					try {
						FileInputStream fis=new FileInputStream(f1);
						ObjectInputStream ois=new ObjectInputStream(fis);
						studlist=(ArrayList<Student>)ois.readObject();
						
						for(Student s1:studlist) {
							System.out.println(s1);
						}
					} catch (IOException | ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				
		}while(no != 2);
			sc.close();
		
	}

}

