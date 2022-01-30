// Write a Java program to calculate profit or loss.
package com.raj;

import  java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter your monthly account credit balance");
        double a = RAJ.nextInt();
        System.out.println("enter your monthly account debit balance");
        double b = RAJ.nextInt();
        if (a > b)
        {
            System.out.println("you are in profit of rs " + (a - b));
        } else
        {
            System.out.println("you are in loss " + (b - a));
        }
    }
}
