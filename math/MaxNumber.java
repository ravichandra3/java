package com.math;
import java.util.Scanner;
public class MaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = sc.nextInt(); sc.close();
		System.out.println((firstNumber>secondNumber)? firstNumber+" is the Biggest":secondNumber+" is the Biggest");
	}
}
