// Write a C program to count total number of duplicate elements in an array.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int Size = RAJ.nextInt();
        int []a = new int[Size];
        int i,j,Count=0;
        System.out.println("Enter the Elements of Array: ");
        for(i=0;i<a.length;i++)
        {
            a[i] = RAJ.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    Count++;
                    break;
                }
            }
        }
        System.out.println(" Count of Duplicate elements is "+Count);
    }
}
