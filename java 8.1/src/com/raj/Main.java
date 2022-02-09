// Write a C program to read and print elements of array. - using recursion.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        int []a ;
        a = new int[10];
        for (i=0;i<9;i++)
        {
           a[i] = i;
        }
        for(i=0;i<9;i++)
        System.out.println(a[i]);
    }
}
