package linkedList;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(40);
		l1.add(10);
		l1.add(100);
		l1.add(30);
		l1.add(70);
		l1.add(20);
		
		
		System.out.println(l1.size());
		System.out.println(l1);
		l1.set(4, 80);
		System.out.println(l1);
		l1.addFirst(10);
		System.out.println(l1);
		l1.addLast(200);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.size());
	}

}
