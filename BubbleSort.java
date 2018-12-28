package ds;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		input(sc, arr);
		sort(arr);
		print(arr);
	}
	/**
	 * this method prints the array 
	 * 
	 */
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	/**
	 * this method takes the elements as input for the array
	 * 
	 */
	private static void input(Scanner sc, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	/**
	 * this method sorts the elements in the array the bubble sort technique
	 * 
	 */
	private static void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
