// Write a Java program to input all sides of a triangle and check whether triangle is valid or not.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter the Lenghth of three sides of triangle: ");
        double a = RAJ.nextInt();
        double b = RAJ.nextInt();
        double c = RAJ.nextInt();
        if(a+b>c||a+c>b||b+c>a)
        {
            System.out.println("Entered Sides are Sides of Triangle: ");
        }
        else
        {
            System.out.println("Entered Sides are not Sides of Triangle: ");
        }
    }
}
