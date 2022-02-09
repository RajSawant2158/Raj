// 	Write a C program to copy all elements from an array to another array.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        int []a = {1,2,3,4,5,6,7,8,9};

        for(i=0;i<a.length;i++)
        {
            
        }
        int []b = Arrays.copyOf(a,a.length);
        for(i=0;i<a.length;i++)
            System.out.println(b[i]);

    }
}
