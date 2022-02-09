// Write a Java program to find all factors of a number.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a= RAJ.nextInt();
        int j;
            for(j=1;j<=a;j++)
            {
                if(a%j==0)
                {
                    System.out.println(j);
                }
            }
    }
}
