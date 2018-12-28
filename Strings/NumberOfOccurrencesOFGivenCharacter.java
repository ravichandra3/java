package com.Strings;
import java.util.Scanner;
public class NumberOfOccurrencesOFGivenCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim();
        System.out.println("Enter the Character : ");
        String check = sc.nextLine(); sc.close();
        String out = input.replace(check, "");
        System.out.println("total occurrence of given character is : "+ (input.length()-out.length()));
	}

}
