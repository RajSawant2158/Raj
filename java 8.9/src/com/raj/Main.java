// Write a C program to insert an element in an array.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner RAJ = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = RAJ.nextInt();
        int a[] = new int[size];
        int i;

        System.out.print("Enter the Elements of Array: ");
        for(i=0;i<size;i++)
        {
            a[i] = RAJ.nextInt();
        }
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}
