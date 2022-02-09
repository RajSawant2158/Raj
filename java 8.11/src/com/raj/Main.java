// Write a C program to count frequency of each element in an array.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Araay size");
        int Size = RAJ.nextInt();
        int []a = new int[Size];
        int i,count=0;
        System.out.print("Enter the Array Elements: ");

        for(i=0;i<Size;i++)
        {
            a[i] = RAJ.nextInt();
        }
        System.out.println("Enter the number to find Frequency: ");
        int j = RAJ.nextInt();
        for(i=0;i<Size;i++)
        {
            if(a[i] == j)
            {
                count++;
            }
        }
        System.out.println(j+" occured "+count+" times");
    }
}
