// Write a C program to print all negative elements in an array.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []a = {1 ,2 ,3 ,4 ,5 ,-1 ,-2 ,-3 ,-4 ,-5 };

        for (int i=0;i<10;i++)
        {
            if(a[i]<0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
