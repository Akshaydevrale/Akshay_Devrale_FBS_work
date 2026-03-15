package arrayList;
import java.util.ArrayList;

public class TestArrayList {
	public static void main(String [] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(100);
		l1.add(50);
		l1.add(90);
		l1.add(30);
		
		System.out.println(l1);
		l1.set(1,40);
		System.out.println(l1);
		
		System.out.println(l1.get(4));
		System.out.println(l1.size());
		System.out.println(l1.contains(100));
		
		l1.clear();
		System.out.println(l1);
		
	}
}
