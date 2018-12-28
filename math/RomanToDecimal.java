package com.math;
import java.util.Scanner;
class Solve
{
	int values(char r)
	{
		if(r=='I') return 1;
		if(r=='V') return 5;
		if(r=='X') return 10;
		if(r=='L') return 50;
		if(r=='C') return 100;
		if(r=='D') return 500;
		if(r=='M') return 1000;
		
	return -1;
	}
	int conversion(String Roman)
	{
		int dec =0;
		for(int i=0;i<Roman.length();i++)
		{
			int v1 = values(Roman.charAt(i));
			if(i+1<Roman.length())
			{
				int v2 = values(Roman.charAt(i+1));
				if(v1>v2)
				{
					dec = dec + v1;
				}
				else
				{
					dec = dec + v2 -v1;
					i++;
				}
			}
			else
			{
				dec = dec + v1;
				i++;
			}
		}
		return dec;
	}
}
public class RomanToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Roman number to be converted : ");
		String Roman = sc.nextLine().toUpperCase(); sc.close();
		Solve s =new Solve();
		System.out.println("The decimal Equalent of your given Roman number is : "+s.conversion(Roman));
	}
}
