// 	Write a Java program to find frequency of each digit in a given integer.
package com.raj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = RAJ.nextInt();
        int rem, add, a, b;
        a = n;

        for (int i = 0; i <= 9; i++) {
            b = a;
            add = 0;
            while (b != 0) {
                rem = b % 10;
                if (rem == i) {
                    add++;
                }
                b = b / 10;
            }
            if (add > 0) {
                System.out.println("Frequency of " + i + " is : " + add);
            }
        }
    }
}