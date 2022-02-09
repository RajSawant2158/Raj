// Write a Java program to print all Armstrong numbers between 1 to n.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the last Number");
        int num = RAJ.nextInt();
        for (int i=0;i<=num;i++){
            int n=i;
        int sum=0,a;
        int x=n;
            for (n = x; n > 0; n /= 10) {
                a = n % 10;
                sum = sum + (a * a * a);
            }

            if (x == sum) {
                System.out.println(x);
            }
        }

    }
}
