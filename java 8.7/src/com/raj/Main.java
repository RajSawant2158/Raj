// Write a C program to count total number of negative elements in an array.
package com.raj;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i,sum=0;
        int []a = {1,2,3,4,5,-5,-4,-3,-2,-1};
        for(i=0;i<a.length;i++)
        {
           if(a[i]<0)
           {
               System.out.println(a[i]);
               sum=sum+1;
           }
        }System.out.println("Total Nigative numbers are -> "+sum);
    }
}
