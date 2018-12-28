package com.math;
import java.util.Scanner;
public class HCFANDLCM {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two numbers : ");
	int FirstNum = sc.nextInt();
	int SecondNum = sc.nextInt(); sc.close();
	int x=FirstNum,y=SecondNum,temp,hcf,lcm;
	while(y!=0)
	{
		temp = y;
		y=x%y;
		x=temp;
	}
	hcf = x;
	lcm = (FirstNum*SecondNum)/hcf;
	System.out.println("Hcf of two numbers is : "+hcf);
	System.out.println("LCM of two numbers is : "+lcm);
}
}
