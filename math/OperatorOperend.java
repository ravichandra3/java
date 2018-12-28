package com.math;

import java.util.Scanner;
public class OperatorOperend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First operator :");
		int firstOperator = sc.nextInt();
		System.out.println("Enter Second operator :");
		int SecondOperator = sc.nextInt();
		System.out.println("Enter operand  (+  -  /  * ) : ");
		char operand = sc.next().charAt(0);
		sc.close();
		switch(operand)
		{
		case '+':
			System.out.println("The Addition is :"+ (firstOperator+SecondOperator));
			break;
		case '-':
			System.out.println("The Substration is :"+ (firstOperator-SecondOperator));
			break;
		case '*':
			System.out.println("The Multiplication is :"+ (firstOperator*SecondOperator));
			break;
		case '/':
			System.out.println("The Division is :"+ (firstOperator/SecondOperator));
			break;
		default :
			System.exit(0);
		}
	}
}
