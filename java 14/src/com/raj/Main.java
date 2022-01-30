// Write a C program to enter base and height of a triangle and find its area.
package com.raj;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter the Base first and then Hight of Triangle:");
        int a = RAJ.nextInt();
        int b = RAJ.nextInt();
        System.out.println("The Area of Triangle "+ a*b/2);

    }
}
