package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner RAJ = new Scanner(System.in);
     System.out.println("Enter temperature in Celsius");
     double a = RAJ.nextInt();
     double b = (a * 9/5) + 32;
     System.out.println("Temperature in Fahrenheit is ");
     System.out.println(b);

    }
}
