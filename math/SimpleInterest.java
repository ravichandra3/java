package com.math;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount :");
		int p = sc.nextInt();
		System.out.println("Enter rate % per annum :");
		int r = sc.nextInt();
		System.out.println("Enter time :");
		int t = sc.nextInt(); sc.close();
		System.out.println("Simple intrest is : "+((p*r*t)/100));
	}
}
