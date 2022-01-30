// Write a Java program to enter principle, time, rate and calculate Compound Interest.
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

        double i = p * (Math.pow((1 + r/100),t));
        double Ci = i-p;
        System.out.println(" The total Compound Interest is: Rs "+Ci);
    }
}
