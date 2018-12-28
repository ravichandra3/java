package com.Strings;
import java.util.Scanner;
public class ReverseAString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim(); sc.close();
        String out="";
        for(int i=input.length()-1;i>=0;i--)
        {
        	out = out +input.charAt(i);
        }
        System.out.println(out);
}
}

