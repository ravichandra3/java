package ds;

public class AppD {

	public static void main(String[] args) {
		DoublyLinkedList l = new DoublyLinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.delete(2);
		l.delete(3);
		l.show();
	}

}
