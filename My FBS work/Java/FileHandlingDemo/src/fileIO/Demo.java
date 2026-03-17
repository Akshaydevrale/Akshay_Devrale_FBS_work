package fileIO;

import java.io.*;

class Student implements Serializable {
	int roll;
	String name;
	double marks;
	
	Student(int roll,String name,double marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "Roll No:"+roll+" Name:"+name+" Marks:"+marks;
	}
}

public class Demo {

	public static void main(String [] args) {
		
		try {
			FileInputStream fis=new FileInputStream("mydata.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student s1=(Student)ois.readObject();
			System.out.println(s1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main1(String[] args) {
		
		Student s1=new Student(101,"Stark",88);
		
		try {
			FileOutputStream fos=new FileOutputStream("mydata.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println("Good to go");
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
