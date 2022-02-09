// Write a C program to count total number of even and odd elements in an array.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,Sum_Odd=0,Sum_Even=0;
        int []a = { 1,2,3,4,5,6,7,8,9 };
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                Sum_Even=Sum_Even+a[i];

            }
            else
                if(a[i]%2!=0)
                {
                    Sum_Odd = Sum_Odd+a[i];
                }
        }  System.out.println("Sum of Even numbers are: "+Sum_Even);
        System.out.println("Sum of Odd numbers are: "+Sum_Odd);
    }
}
