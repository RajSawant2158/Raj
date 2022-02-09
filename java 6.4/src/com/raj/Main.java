// Write a Java program to find maximum between two numbers using switch case.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        final int a = RAJ.nextInt();
        System.out.println("Enter the second number: ");
        final int b = RAJ.nextInt();

        int ch =0 ;

            switch (ch=(a>b?a:b))
            {
                case a : System.out.println("a");
                break;
                case b : System.out.println("b");
                break;

            }
    }
}
