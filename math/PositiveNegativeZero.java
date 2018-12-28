package com.math;
import java.util.Scanner;
public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt(); sc.close();
		if(number == 0)
		{
			System.out.println("Given number is Zero");
		}
		else if(number >0)
		{
			System.out.println("Given number is Positive");
		}
		else
		{
			System.out.println("Given number is Negative");
		}
	}
}
