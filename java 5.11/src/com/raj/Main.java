// Write a Java program to input week number and print week day.
package com.raj;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Week");
        int a = RAJ.nextInt();
        System.out.println(" The "+a*7+ " days in " +a+ " weeks");

    }
}
