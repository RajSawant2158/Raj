// Write a C program to find maximum and minimum element in an array. - using recursion.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min= Integer.MAX_VALUE;
        int a[] = {1,2,3,4,5,6,7,8,9};

        for(int i=0;i<9;i++)
        {
            if (min > a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum Value = "+min);

        for(int i=0;i<a.length;i++)
        {
            if(min < a[i])
            {
                min=a[i];
            }
        }System.out.println("Maximum Value = "+min);
    }
}
