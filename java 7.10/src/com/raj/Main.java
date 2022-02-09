// Write a Java program to count number of digits in a number.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = RAJ.nextInt();
        int i = 0;
        while(a>0)
        {
            a=a/10;
            i++;
        }
        System.out.println(" has "+i+" digits.");
    }
}
