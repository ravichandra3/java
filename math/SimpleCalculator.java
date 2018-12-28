package com.math;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second number :");
		int SecondNumber = sc.nextInt();
		System.out.println("Select an option \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit");
		int input = sc.nextInt();
		sc.close();
		switch(input)
		{
		case 1:
			System.out.println("The Addition is :"+ (firstNumber+SecondNumber));
			break;
		case 2:
			System.out.println("The Substration is :"+ (firstNumber-SecondNumber));
			break;
		case 3:
			System.out.println("The Multiplication is :"+ (firstNumber*SecondNumber));
			break;
		case 4:
			System.out.println("The Division is :"+ (firstNumber/SecondNumber));
			break;
		case 5:
			System.exit(0);
		}
	}
}
