// Write a Java program to enter principle, time, rate and calculate Simple Interest.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);

        System.out.println("Enter the Principle value: ");
        double p = RAJ.nextDouble();

        System.out.println("Enter the Time in years: ");
        double t = RAJ.nextDouble();

        System.out.println("Enter the annual interest Rate: ");
        double r = RAJ.nextDouble();

        double i = p*(1+r*t);

        System.out.println(" The total Interest is: Rs "+i);
    }
}
