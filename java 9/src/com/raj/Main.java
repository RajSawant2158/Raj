package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner RAJ = new Scanner(System.in);
     System.out.println("Enter temperature in Fahrenheit ");
     double a = RAJ.nextInt();
     double b = (a - 32) * 5/9;
     System.out.println("Temperature in Celsius is ");
     System.out.println(b);

    }
}
