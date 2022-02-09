// Write a Java program to find sum of all natural numbers between 1 to n.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = RAJ.nextInt();
        int i = 1;
        int sum=0;

        while(i<=a)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of 1 to "+a+" Numbers is "+sum);
    }
}
