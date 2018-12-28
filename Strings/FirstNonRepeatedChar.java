package com.Strings;

import java.util.Scanner;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch='\u0000';
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim(); sc.close();
        ch = getCh(ch, input);
        System.out.println(ch);
    }

    private static char getCh(char ch, String input) {
        for (int i = 0; i < input.length(); i++) {
            int temp=0;
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    temp=1;
                }
            }
            if(temp==0){
                ch= input.charAt(i);
                break;
            }
        }
        return ch;
    }
}
