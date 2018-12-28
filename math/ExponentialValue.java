package com.math;
import java.util.Scanner;
public class ExponentialValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number : ");
		int number = sc.nextInt(); sc.close();
		System.out.println("The exponential value of "+number+" is : "+Math.exp(number));
	}
}
