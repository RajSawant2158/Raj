// 	Write a Java program to print all Perfect numbers between 1 to n.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the last Number");
        int num = RAJ.nextInt();
        for (int i=0;i<num;i++){

            int sum=0;

            for (int n = 1; n<i ; n++) {
                if(i % n == 0 )
                    sum = sum + (n);
            }

            if (i == sum) {
                System.out.println(i);
            }
        }

    }
}