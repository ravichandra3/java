package com.math;
import java.util.Scanner;
class Conversion
{
void Binary(int n)
{
	int [] bin=new int [100];
	int i=0;
	while(n>0)
	{
		bin[i]=n%2;
		n=n/2;
		i++;
	}
	System.out.print("Binary conversion of given number is : ");
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(bin[j]);
	}
}
void Octal(int n)
{
	int [] Oct=new int [100];
	int i=0;
	while(n>0)
	{
		Oct[i]=n%8;
		n=n/8;
		i++;
	}
	
	System.out.print("\nOctal conversion of given number is : ");
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(Oct[j]);
	}
}
void Hexa(int n)
{
     String s=""; 
     char [] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     int rem;
     while(n>0)
     {
       rem=n%16; 
       s=hex[rem]+s; 
       n=n/16;
     }
     System.out.println("\nHexaDecimal conversion of given number is : "+s);
  }
}
public class DecToBin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		int num = sc.nextInt(); sc.close();
		Conversion c= new Conversion();
		c.Binary(num);
		c.Octal(num);
		c.Hexa(num);
	}
}
