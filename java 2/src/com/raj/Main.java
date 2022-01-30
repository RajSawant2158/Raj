// Write a C program to enter two numbers and find their sum.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner RAJ = new Scanner(System.in);
         System.out.println("enter first number:  ");
         int a = RAJ.nextInt();
         System.out.println("enter another number:  ");
         int b = RAJ.nextInt();
         System.out.println("Addition of "+a+" and "+b+ " is: "+(a+b));

    }
}
