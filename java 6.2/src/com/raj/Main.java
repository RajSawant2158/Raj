// Write a Java program print total number of days in a month using switch case.
package com.raj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner RAJ = new Scanner(System.in);
        System.out.println("enter the month");
        String a = RAJ.next();
        switch (a)
        {
            case "January","March","May","July","August","October","December" -> System.out.println("31 days in "+a);

            case "january","march","may","july","august","october","december" -> System.out.println("31 days in "+a);

            case "April","June","September","November" -> System.out.println("30 days in "+a);

            case "april","june","september","november" -> System.out.println("30 days in "+a);

            case "february","February" -> System.out.println("28 days in "+a);
        }
    }
}
