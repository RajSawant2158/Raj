// Write a Java program to check whether year is leap year or not using conditional operator.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the year to Check: ");
        int a = RAJ.nextInt();
        if (a % 4 == 0 & a % 100!=0)
            System.out.println("Year is Leap ");
        else
            if (a % 100 == 0)
                System.out.println("Year is not Leap");
            else
                if (a % 400 ==0)
                    System.out.println("Year is Leap ");
                else
                    System.out.println("Year is not Leap ");
    }
}
