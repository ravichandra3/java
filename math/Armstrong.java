package com.math;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt(); sc.close();
		int temp =0,s=0,num1=num;
		while(num!=0)
		{
			temp = num%10;
			s +=(temp*temp*temp);
			num = num/10;
		}
		System.out.println((s==num1)? "This is an ARMSTRONG" :"This NOT an AMSTRONG");
}
}
