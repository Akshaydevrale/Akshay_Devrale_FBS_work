package list;

import java.util.*;

class generics{
	
	public static void main(String args[]) {
		List<Integer> a1=new ArrayList<Integer>();
		
		a1.add(45);
		a1.add(32);
		a1.add(93);
		a1.add(63);
		
		for(Integer i1: a1) {
			System.out.println(i1);
		}
	}
}