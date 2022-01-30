package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner RAJ = new Scanner(System.in);
       System.out.println("Enter the Radius of Circle:");
       int a = RAJ.nextInt();
       double b = 2 * a;
       double c = 2 * 3.14 * a;
       double d = 3.14 * a * a;
       System.out.println("Diameter of circle is "+b);

       System.out.println("Circumference of circle is "+c);

       System.out.println("Area of circle is "+d);

    }
}
