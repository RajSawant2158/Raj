// Write a C program to calculate area of an equilateral triangle.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("\n Enter the side of equilateral Triangle");
        double a = RAJ.nextInt();
        double b = 1.73 * a * a / 4;
        System.out.println("the Area of Equilateral Triangle is: "+b);

    }
}
