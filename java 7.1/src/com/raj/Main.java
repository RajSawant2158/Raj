// Write a Java program to print all natural numbers from 1 to n. - using while loop
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter how many natural number you want: ");
        int i=1;
        int a = RAJ.nextInt();
        while (i<=a)
        {
            System.out.println(i);
            i++;
        }
    }
}
