// Write a Java program to print multiplication table of any number.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int a = RAJ.nextInt();
        int i = 1;
        int sum=0;

        while(i<=10)
        {
            sum =a*i;
            System.out.println(sum);
            i++;

        }


    }
}
