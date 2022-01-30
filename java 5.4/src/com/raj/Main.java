// Write a Java program to check whether a number is divisible by 5 and 11 or not.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = RAJ.nextInt();
        if (( a % 5 & a % 11 ) == 0)
        {
            System.out.println(a+" is Devisible by 5 and 11.");
        }
        else
        {
            System.out.println(a+ " is not devisible by 5 and 11.");
        }
    }
}
