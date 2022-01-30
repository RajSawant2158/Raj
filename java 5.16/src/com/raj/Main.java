// Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter three sides of Triangle: ");
        double a = RAJ.nextInt();
        double b = RAJ.nextInt();
        double c = RAJ.nextInt();

        if(a==b&&b==c&&a==c)
        {
            System.out.println("Entered three sides are sides of Equilateral Triangle: ");
        }
        else
        {
            if(a==b||b==c||a==c)
            {
                System.out.println("Entered three sides are sides of Isosceles Triangle: ");
            }
            else
            {
                System.out.println("Entered three sides are sides of Scalene Triangle: ");
            }
        }

    }
}
