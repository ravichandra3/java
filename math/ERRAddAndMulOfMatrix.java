package com.math;
import java.util.Scanner;
class matrix
{
int[][] input(int k[],int r,int c) 
{
	int[][] mat= new int[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
		 mat[i][j]=k[i];
		}
	}
	return (mat);
}	//return (mat);
}
public class ERRAddAndMulOfMatrix {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the no of rows and columns : ");
	int r = sc.nextInt();
	int c = sc.nextInt();
	matrix m = new matrix();
	System.out.println("Enter the elements of the first matrix");
	int k[]= new int [r*c];
	for (int i = 0; i < r*c; i++) {
		k[i]=sc.nextInt();
	}
	int a[][]=m.input((k), r, c);
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	
	
}
}
