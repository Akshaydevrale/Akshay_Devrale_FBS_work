package treeset;

public class MyTree {
	Node root;
	
	public MyTree() {
		
	}

	public MyTree(Node root) {
		super();
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void insert(int data) {
		this.root = insertRec(this.root,data);
	}

	private Node insertRec(Node rootC, int ele) {
		if(rootC == null) {
			rootC = new Node(ele);
			return rootC;
		}
		
		if(ele < rootC.data) {
			rootC.left = insertRec(rootC.left, ele);
		} else if(ele > rootC.data) {
			rootC.right = insertRec(rootC.right,ele);
		}
		return rootC;
	}
	
	public void inOrder() {
		inOrderRec(root);
	}

	private void inOrderRec(Node root) {
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}
}

