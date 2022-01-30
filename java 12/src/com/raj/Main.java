//Write a C program to enter any number and calculate its square root.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = RAJ.nextInt();
        int sr ;
        sr = (int) Math.sqrt(a);
        System.out.println("Square Root of "+a+ " is "+sr);
    }
}
