package list;

import java.util.*;

public class ListDemo {
	
	public static void main(String[] args) {
		TreeSet a1=new TreeSet();
		
		System.out.println("Tree");
		a1.add(34);
		a1.add(23);
		a1.add(6);
		a1.add(75);
		a1.add(11);
		a1.add(4);
		a1.add(45);
		
		System.out.println(a1);
		
	}
	public static void main1(String[] args) {
		List a1=new LinkedList();
		System.out.println("Linkedkist");
		a1.add(34);
		a1.add(23);
		a1.add(6);
		a1.add(75);
		a1.add(11);
		a1.add(4);
		a1.add(45);
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
	}

	public static void main2(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(34);
		a1.add(23);
		a1.add(6);
		a1.add(75);
		a1.add(11);
		a1.add(4);
		a1.add(45);
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
	}

}
