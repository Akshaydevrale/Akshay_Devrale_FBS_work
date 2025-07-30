package singlelinkedlist;

public class MainApp {
	
	Node head;

	public static void main(String[] args) {

		Node n1=new Node(23);
		Node n2=new Node(12);
		Node n3=new Node(55);
		MainApp app=new MainApp();
		app.insert(n1);
		app.insert(n2);
		app.insert(n3);
		app.iterate();
	}

	private void iterate() {
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.value);
			current=current.next;
		}
	}

	private void insert(Node v1)
	{
		if(head==null)
		{
			head=v1;
		}
		else
		{
			Node current=head;
			while(head !=null) {
				current=current.next;
			}
			current.next=v1;
		}
	}

	
}










