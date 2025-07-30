package list;

import java.util.*;

class genericsstr{
	public static void main(String args[]) {
		List<String> namelist=new ArrayList<String>();
		
		namelist.add("Jay");
		namelist.add("Veeru");
		namelist.add("Dholu");
		namelist.add("Bholu");
		
		for(String str:namelist) {
			System.out.println(str);
		}
	}
}