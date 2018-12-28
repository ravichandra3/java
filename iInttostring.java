package strings;

import java.util.Scanner;

public class iInttostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		int[] n=new int[l];
		sc.close();
		for(int i=0;i<l;i++)
		{
			n[i]=sc.nextInt();
		}
		for (int i = 0; i < n.length; i++) 
		{
			System.out.print(Character.toString((char) n[i]));
		}
	}
}
