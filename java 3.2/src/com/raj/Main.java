// Write a Java program to check Most Significant Bit (MSB) of a number is set or not.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = RAJ.nextInt();
        if((a&8)==8)
        {
            System.out.println("Most Significant Bit (MSB) of a number is set");
        }
        else {
            System.out.println("Most Significant Bit (MSB) of a number is not set.");
        }
    }
}