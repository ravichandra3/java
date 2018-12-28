package ds;
import java.util.Scanner;
public class Set {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		System.out.println("Enter array elements : ");
		int arr[] = new int[size];
		set(sc, arr);
		print(arr);
	}
	/**
	 * 
	 *this method gives the output of the set array
	 */
	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	/**
	 * 
	 * this method take the input of only the elements that are not already in the array
	 */
	private static void set(Scanner sc, int[] arr) {
		int nextelement;
		loop:
		for (int i = 0; i < arr.length; i++) {
			nextelement = sc.nextInt();
			for (int j = 0; j <= i; j++) {
				if (nextelement == arr[j]) {
					System.out.println("this element is already there in the array");
					i--;
					continue loop;
				}
			}
			arr[i] = nextelement;	
		}
	}
}
