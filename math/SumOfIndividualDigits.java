package com.math;
import java.util.Scanner;
public class SumOfIndividualDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt(); sc.close();
		int temp=0,sum = 0;
		while(num!=0)
		{
			temp = num%10;
			sum +=temp;
			num = num/10;
		}
		System.out.println("The total is : "+sum);
	}
}
