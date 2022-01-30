// Write a C program to enter length and breadth of a rectangle and find its perimeter.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner RAJ = new Scanner(System.in);
       System.out.println(" Enter the length of rectangle:");
       int a = RAJ.nextInt();
       System.out.println("Enter the breadth of rectangle:");
       int b = RAJ.nextInt();
       System.out.println(2*(a+b));
    }
}
