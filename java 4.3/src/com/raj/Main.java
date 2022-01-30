// Write a Java program to check whether a number is even or odd using conditional operator.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = RAJ.nextInt();
        if (a%2 == 1)
            System.out.println("number is odd");
        else System.out.println("number is even");
    }
}
