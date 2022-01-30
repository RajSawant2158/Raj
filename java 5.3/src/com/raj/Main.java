// Write a Java program to check whether a number is negative, positive or zero.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = RAJ.nextInt();
        if (a>0)
        {
            System.out.println(a+ " is Positive Number..");
        }
        else
        {
            if (a<0)
            {
                System.out.println(a+ " is Negative Number..");
            }
            else
            {
                System.out.println(a+ " is ZERO..");
            }
        }
    }
}
