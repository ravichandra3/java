package ds;

public class LinkedList {
	Node head = null;
	Node last = null;

	public void add(int data) {

		Node node = new Node();
		node.data = data;
		node.nextnode = null;

		if (head == null) {

			head = node;

		} else {
			Node n = head;
			while (n.nextnode!= null) {
				n = n.nextnode;
			}
			n.nextnode = node;
		}

	}

	public void show() {

		Node node = head;

		while (node.nextnode != null) {
			System.out.println(node.data);
			node = node.nextnode;
		}
		System.out.print(node.data);

	}

	
	
	public void delete(int index) {
	 Node temp =head;
		if(index==0)
		{
		 head = temp.nextnode;
				 return;
		}
		 for (int i=0; temp!=null && i<index-1; i++) 
	            temp = temp.nextnode; 
	  
	        if (temp == null || temp.nextnode == null) 
	            return; 
	  
	        
	        Node next = temp.nextnode.nextnode; 
	  
	        temp.nextnode = next;  
	    } 
	  
	 
	 
	}
	


class Node {
	int data;
	Node nextnode = null;
	
}