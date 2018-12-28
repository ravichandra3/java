package com.math;
import java.util.Scanner;
class Fact
{
	 int factorial(int n) 
	 {
	      int f;
	      for(f = 1; n > 1; n--)
	      {
	         f *= n;
	      }
	      return f;
	  }
	 int fact(int n,int r) 
	 {
	      return factorial(n) / ( factorial(n-r) * factorial(r) );
	 }
}
public class PascalsTriangle {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length : ");
			int size = sc.nextInt(); sc.close();
			Fact f = new Fact();
			for(int i=0;i<size;i++)
			{
				for(int j=size-i;j>1;j--)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print(" "+f.fact(i, j));
				}
				System.out.println();
			}
		}
	}