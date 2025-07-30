package list;

import java.util.*;

class Student1{
	int id;
	String name;
	
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return " Id: "+id+" Name: "+name;
	}
}

public class Test2 {
	public static void main(String args[]) {
		
		List l1=new ArrayList();
		
		Student1 s1=new Student1(45,"Rocky");
		Student1 s2=new Student1(22,"Tony");
		Student1 s3=new Student1(33,"Romario");
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	}
}
