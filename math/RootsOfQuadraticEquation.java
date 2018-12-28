package com.math;
import java.util.Scanner;
public class RootsOfQuadraticEquation {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the values of a,b and c as in ax^2+bx+c : ");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt(); sc.close();
		 double d,root1=0,root2=0;
		 d= (b*b)-(4*a*c);
		 if(d>=0) 
		 {
			 root1=((-b + Math.sqrt(d))/(2*a));
			 root2=((-b - Math.sqrt(d))/(2*a));
		 }
		 if (d==0)
		 {
			 System.out.println("Roots are equual, root is : " +root1);
		 }
		 System.out.println((d>0)? "Roots are : "+root1+","+root2 : "roots are Imaginary");
	}
}
