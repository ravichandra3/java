package com.math;
import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Radius of the circle : ");
		double radius = sc.nextDouble(); sc.close();
		System.out.println("Area of the circle is : "+ (2*3.14*radius));
		System.out.println("Circumference of the circle is : "+(3.14*radius*radius));
	}
}
