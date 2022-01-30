// Write a C program to enter two angles of a triangle and find the third angle.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the first angle of triangle: ");
        int a = RAJ.nextInt();
        System.out.println("Enter the another Angle of Triangle: ");
        int b = RAJ.nextInt();
        int c = 180 - (a + b);
        System.out.println("third angle of Triangle is "+c);
    }
}
