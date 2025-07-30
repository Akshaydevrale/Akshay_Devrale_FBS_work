package list;

import java.util.LinkedList;

class Students{
	int id;
	String name;
	double marks;
	
	Students(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return " Id: "+id+" Name: "+name+" Marks: "+marks;
	}
}

public class Test1 {

	public static void main(String[] args) {

		
		LinkedList l1=new LinkedList();
		
		Students s1=new Students(101,"Akki",67);
		Students s2=new Students(1,"Marco",45);
		Students s3=new Students(11,"Spider",55);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
	}

}
