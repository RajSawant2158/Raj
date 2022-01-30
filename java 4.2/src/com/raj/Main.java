// Write a Java program to find maximum between three numbers using conditional operator.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter the First Number:");
        int a = RAJ.nextInt();
        System.out.println("enter the Second Number:");
        int b = RAJ.nextInt();
        System.out.println("enter the Third Number:");
        int c = RAJ.nextInt();
        System.out.println("The Maximum Number of these Three Numbers is:");
        int d = (a>b ? a:b);
        int max = (c>d ? c:d);
        System.out.println(" the largest Number is :"+max);

    }
}
