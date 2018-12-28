package ds;

public class DoubleEndedQueue {
	int front = 0;
	int size_front = 0;
	int array[] = new int[6];
	int rear = 5;	
	int size_rear = array.length;

	public void push_front(int data) {
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = data;
	}

	public void push_rear(int data) {

		/*
		 * for (int i =0; i <array.length-1 ; i++) { array[i]=array[i+1]; }
		 * array[array.length-1]=data;
		 */

		array[rear] = data;
		size_rear = size_rear - 1;
		rear = rear - 1;
	}

	/*
	 * public int pop_front() { int v=0; int data=array[v]; size_front=size_front+1;
	 * size_rear=size_rear-1;
	 * 
	 * 
	 * return data;
	 * 
	 * }
	 */
	public void show() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
