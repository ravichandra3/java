package com.Strings;

import java.util.Scanner;
public class FindDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine().trim().replace(" ",""); sc.close();
        int l=0;
        char a[]= new char[10];
        l = getDup(input, l, a);
        for(int i=0;i<=l;i++)
        {
            System.out.print(a[i]);
        }
    }

    private static int getDup(String input, int l, char[] a) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if(input.charAt(i)==input.charAt(j))
                {
                    int flag =0;
                    for(int k=0;k<10;k++)
                    {
                        if(a[k]==input.charAt(i))
                        {
                            flag=1;
                        }

                    }
                    if(flag ==0)
                    {
                        a[l]=input.charAt(i);
                        l++;
                    }
                }
            }
        }
        return l;
    }
}
