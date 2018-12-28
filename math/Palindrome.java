package com.math;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String inputString = sc.nextLine(); sc.close();
		int temp=0;
		sc.close();
		for(int i=0,j=inputString.length()-1;i<inputString.length()/2;i++,j--)
		{
			if(inputString.charAt(i)==inputString.charAt(j))
				temp=1;
			else
			{
				temp=0;
				break;
			}
		}
		System.out.println((temp==1)? "this is a palindrome" : "this is NOT a palindrome");
	}
}
