package com.semanticsquare.basics.oldprojects;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        boolean b = palindrome ();
        System.out.println(b);
    }

      public static boolean palindrome (){
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
        in.close();
          return false;
      }
      
}


