package com.math;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of the Triangle : ");
		int base = sc.nextInt();
		System.out.println("Enter height of the Triangle : ");
		int height = sc.nextInt(); sc.close();
		System.out.println("Area of given Triangle is : "+(0.5*base*height));
	}
}
