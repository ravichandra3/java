package com.math;
import java.util.Scanner;
class Input{
	private double real;
	private double imaginary;
	public void sets(String s)
	{
	String st[]=s.split("\\+");
	//real=0;
	//imaginary=0;
	for (int i=0;i<st.length; i++)
	{
		if(st[i].contains("i")) 
			
		{
			String str=st[i].replace("i", "");
			imaginary=Double.parseDouble(str);
		}
		else
		{
			real=Double.parseDouble(st[i]);
		}
	}
	}
	public double getReal()
	{
		return real;
	}
	public double getImaginary()
	{
		return imaginary;
	}
}
public class Complex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first complex number : ");
	String first= sc.next();
	Input a = new Input();
	a.sets(first);
	System.out.println("Enter a second complex number : ");
	String second= sc.next(); sc.close();
	Input  b= new Input();
	b.sets(second);
	System.out.println();
	System.out.printf("Addition of two complex numbers is : %.1f + %.1fi",(a.getReal()+b.getReal()),(a.getImaginary()+b.getImaginary()));
	System.out.printf("\nMultiplication of two complex numbers is : %.1f + %.1fi",((a.getReal()*b.getReal())-(a.getImaginary()*b.getImaginary())),((a.getReal()*b.getImaginary())+(a.getImaginary()*b.getReal())));
}
}
