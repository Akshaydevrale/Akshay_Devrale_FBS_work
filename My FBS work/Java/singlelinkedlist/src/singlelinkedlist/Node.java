package singlelinkedlist;

public class Node {
	
	int value;
	Node next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

	
}
