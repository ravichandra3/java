package com.Strings;

import java.util.Scanner;
public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim(); sc.close();
        String Output = input.replace(" ","");
        System.out.println(Output);
    }
}
