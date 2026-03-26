package treeSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<>();
		
		t1.add(100);
		t1.add(45);
		t1.add(110);
		t1.add(15);
		t1.add(290);
		t1.add(105);
		t1.add(21);
		t1.add(7);
		t1.add(118);
		
		System.out.println(t1);
		System.out.println(t1.size());
		t1.add(50);
		System.out.println(t1);
		System.out.println(t1.first());
		System.out.println(t1.last());
		System.out.println(t1.contains(105));
		System.out.println(t1.size());
		t1.remove(50);
		t1.remove(105);
		System.out.println(t1);
		System.out.println(t1.size());
	}

}
