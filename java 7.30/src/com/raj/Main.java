// Write a Java program to check whether a number is Armstrong number or not.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = RAJ.nextInt();
        int c=0,a;
        int x=n;
        for(n=x;n>0;n/=10)
        {
            a = n%10;
            c = c+(a*a*a);
        }
        if(x==c)
        {
            System.out.println("Armstrong Number.... ");
        }else
        {
            System.out.println("Not Armstrong Number....");
        }
    }
}
