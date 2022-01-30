package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner RAJ = new Scanner(System.in);
     System.out.println("Enter the length in centimeters:");
     double a = RAJ.nextInt();
     System.out.println("Length in meters is  ");
     System.out.println(a/100);
     System.out.println("Length in kelometers is  ");
     System.out.println(a/100000);
    }
}
