package com.math;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num =sc.nextInt(); sc.close();
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of the given number is : "+fact);
	}

}
