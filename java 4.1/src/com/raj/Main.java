// Write a Java program to find maximum between two numbers using conditional operator.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = RAJ.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = RAJ.nextInt();
        System.out.println( "the maximum number between these two numbers is : ");
                System.out.println( a>b ? a:b );

    }
}
