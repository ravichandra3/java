package com.math;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MAX number till which you want the febonacci series :");
		int maxnum = sc.nextInt(); sc.close();
		int a = 0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		while(c<maxnum-a)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
