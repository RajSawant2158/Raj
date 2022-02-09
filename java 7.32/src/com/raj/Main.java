// Write a Java program to check whether a number is Perfect number or not.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the last Number");
        int num = RAJ.nextInt();
            int sum=0;

            for (int n = 1; n<num ; n++) {
                if(num % n == 0 )
                sum = sum + (n);
            }

            if (num == sum) {
                System.out.println("Number is Perfect Number");
            }else
            {
                System.out.println("Number is not Perfect Number");
        }

    }
}