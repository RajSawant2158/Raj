// Write a C program to find second largest element in an array.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int y, x;
        x = y = Integer.MIN_VALUE;
        int []a = { 0,1,2,3,4,5,6,7,8,9 };
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]>x)
            {
                y = x ;
                x = a[i];
            }
            else
                if(a[i]>y&&a[i]<x)
                {
                    y=a[i];
                }

        } System.out.println(y);
    }
}
