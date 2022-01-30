// Write a Java program to check whether a character is uppercase or lowercase alphabet.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = RAJ.next().charAt(0);

        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println(ch + " is Lowecase Alphabet ");
        }
        else
        {
            if(ch >= 'A' && ch <= 'Z')
            {
                System.out.println(ch + " is Uppercase Alphabet ");
            }
        }
    }
}