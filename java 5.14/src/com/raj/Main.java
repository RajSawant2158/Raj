// Write a Java program to input angles of a triangle and check whether triangle is valid or not.
package com.raj;

import  java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter three angles of triangle: ");
        int a = RAJ.nextInt();
        int b = RAJ.nextInt();
        int c = RAJ.nextInt();
        if(a+b+c==180)
        {
            System.out.println(" given angles are angles of triangle ");
        }
        else
        {
            System.out.println(" given angles are not angles of triangle..");
        }
    }
}
