// Write a Java program to check whether a number is even or odd.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = RAJ.nextInt();
        if (a%2==0)
        {
            System.out.println(a+" is Even Number");
        }
        else
        {
                System.out.println(a+" is Odd Number");
        }
    }
}
