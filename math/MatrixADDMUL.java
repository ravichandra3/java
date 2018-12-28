package com.math;
import java.util.Scanner;
public class MatrixADDMUL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows and columns : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter the elements of the first matrix");
		int firstMatrix [][] = new int[row][col];
		readDtata(sc, row, col, firstMatrix);
		System.out.println("Enter the elements of the second matrix");
		int secondMatrix [][] = new int[row][col];
		readDtata(sc, row, col, secondMatrix);
		sc.close();
		int OutputMatrix [][] = new int[row][col];
		System.out.println("Addition of two matrices is :");
		addMatrix(row, col, firstMatrix, secondMatrix);
		System.out.println("Multiplication of two matrices is :");
		mulMatrix(row, col, firstMatrix, secondMatrix, OutputMatrix);
	}

	private static void mulMatrix(int r, int c, int[][] firstMatrix, int[][] secondMatrix, int[][] OutputMatrix) {
		for(int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				for(int k=0;k<r;k++)
				{
					OutputMatrix[i][j]=OutputMatrix[i][j]+firstMatrix[i][k]*secondMatrix[k][j];
				}
			}
		}
	}

	private static void addMatrix(int r, int c, int[][] firstMatrix, int[][] secondMatrix) {
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(firstMatrix[i][j]+secondMatrix[i][j]);
			}
			System.out.println();
		}
	}

	private static void readDtata(Scanner sc, int r, int c, int[][] firstMatrix) {
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 firstMatrix[i][j]=sc.nextInt();
			}
		}
	}

}
