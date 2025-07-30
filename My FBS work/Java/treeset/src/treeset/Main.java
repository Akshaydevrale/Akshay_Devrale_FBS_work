package treeset;

public class Main {

public static void main(String[] args) {
		
		MyTree mytree = new MyTree();
		
		mytree.insert(54);
		mytree.insert(86);
		mytree.insert(25);
		mytree.insert(95);
		mytree.insert(854);
		mytree.insert(68);
		mytree.insert(47);
		mytree.insert(10);
		
		System.out.println("Inorder Traversal : ");
		mytree.inOrder();
	}

}
