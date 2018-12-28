package com.math;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Enter the power : ");
		int power = sc.nextInt(); sc.close();
		System.out.println(number +" power "+ power+" is : "+(int)Math.pow(number, power));
	}
}
