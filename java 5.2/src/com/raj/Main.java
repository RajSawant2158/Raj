// Write a Java program to find maximum between three numbers.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = RAJ.nextInt();
        System.out.println("Enter Second number: ");
        int b = RAJ.nextInt();
        System.out.println("Enter Third number: ");
        int c = RAJ.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is maximum number");
        } else
            if (b > a && b > c) {
            System.out.println(b + " is maxximum Number");
        } else
            if (c > a && c > b)
            {
            System.out.println(c + " is Maximum Number");
            }
                else
                    System.out.println("Numbers are Equal");

    }
}
