// Write a Java program to find maximum between two numbers.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = RAJ.nextInt();
        System.out.println("Enter Second Number: ");
        int b = RAJ.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater than " +b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }

    }
}
