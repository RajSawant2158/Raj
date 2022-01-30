// Write a C program to enter marks of five subjects and calculate total, average and percentage.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("Enter the marks of Marathi \n English \n Hindi \n Mathematics \n Science");
        int a = RAJ.nextInt();
        int b = RAJ.nextInt();
        int c = RAJ.nextInt();
        int d = RAJ.nextInt();
        int e = RAJ.nextInt();
        System.out.println("Enter the Total Marks of Examination: ");
        int f = RAJ.nextInt();
        int total = a+b+c+d+e;
        int avg = a+b+c+d+e/5;
        double percentage = (total * 100) / f;
        System.out.println("Total marks you obtained are: " +total+ " out of "+f);

        System.out.println("Average marks are: " +avg);

        System.out.println("Percentage you got are: " +percentage+ " %");

    }
}
