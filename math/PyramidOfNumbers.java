package com.math;

public class PyramidOfNumbers {

	public static void main(String[] args) {
	int	num=0;
		for(int i=0;i<4;i++)
		{
			for(int j=4-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				num++;
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}
}