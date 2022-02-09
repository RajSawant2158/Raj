// Write a C program to delete an element from an array at specified position.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = RAJ.nextInt();
        int a[] = new int[size];
        int i;

        System.out.println("Enter the Elements of Array: ");
        for(i=0;i<size;i++)
        {
            a[i] = RAJ.nextInt();
        }
        for(i=0;i<size;i++)
        System.out.println("Array Before removing Element: "+a[i]);
        int remove = 0;
        for(i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        for(i=remove;i<a.length-1;i++)

        System.out.println("Array after removing Element: "+a[i]);

    }
}
