package com.math;
import java.util.Scanner;
public class AreaAndPerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		int breadth = sc.nextInt(); sc.close();
		System.out.println("Area of the given Rectangle is : "+(length*breadth) );
		System.out.println("Perimeter of the given Rectangle is : "+(2*(length+breadth)));
	}
}
