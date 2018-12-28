package ds;
public class DoublyLinkedList {
	Noded head = null;
	Noded last = null;
	
	public void add(int data) {
		Noded node = new Noded();
		node.data = data;
		node.nextnode = null;
		node.prevnode = null;
		if (head == null) {
			head = node;
			last = node;
		} else {
			Noded n = head;
			last = n;
			while (n.nextnode != null) {
				n = n.nextnode;
				n.prevnode = n;
			}
			n.nextnode = node;
			node.prevnode = n;
		}
	}

	public void show() {
		Noded node = head;
		while (node.nextnode != null) {
			System.out.println(node.data);
			node.prevnode = node;
			node = node.nextnode;
		}
		System.out.print(node.data);
	}

	public void delete(int index) {
		Noded temp = head;
		if (index == 0) {
			head = temp.nextnode;
			head.prevnode = null;
			return;
		}
		for (int i = 0; temp != null && i < index - 1; i++)
			temp.prevnode = temp;
		temp = temp.nextnode;
		if (temp == null || temp.nextnode == null)
			return;
		Noded next = temp.nextnode.nextnode;
		temp.prevnode.prevnode = next;
		next.prevnode = temp;
		temp.nextnode = next;
	}
}

class Noded {
	int data;
	Noded nextnode = null;
	Noded prevnode = null;
}
